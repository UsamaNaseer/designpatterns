package com.practice.interfaceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.practice.interfaceexample.AbstractFactoryDesign.AbstractFactory;
import com.practice.interfaceexample.AbstractFactoryDesign.FactoryProducer;
import com.practice.interfaceexample.AbstractFactoryDesign.Shape;
import com.practice.interfaceexample.FactoryDesign.Animal;
import com.practice.interfaceexample.FactoryDesign.AnimalFactory;
import com.practice.interfaceexample.adapter.Adaptee;
import com.practice.interfaceexample.adapter.Adapter;
import com.practice.interfaceexample.adapter.ITarget;
import com.practice.interfaceexample.builder.Phone;
import com.practice.interfaceexample.builder.PhoneBuilder;
import com.practice.interfaceexample.command.Invoker;
import com.practice.interfaceexample.command.Light;
import com.practice.interfaceexample.command.LightDownCommand;
import com.practice.interfaceexample.command.LightOffCommand;
import com.practice.interfaceexample.command.LightOnCommand;
import com.practice.interfaceexample.command.LightUpCommand;
import com.practice.interfaceexample.decorator.Beverages;
import com.practice.interfaceexample.decorator.Caramel;
import com.practice.interfaceexample.decorator.Tea;
import com.practice.interfaceexample.mvp.presenter.presenter.model.User;
import com.practice.interfaceexample.observer.ConcreteObservable;
import com.practice.interfaceexample.observer.ConcreteObserver;
import com.practice.interfaceexample.mvp.presenter.presenter.ServiceExample;
import com.practice.interfaceexample.mvp.presenter.presenter.UserPresenter;
import com.practice.interfaceexample.strategy.Duck;
import com.practice.interfaceexample.strategy.JetFly;
import com.practice.interfaceexample.strategy.NoQuack;
import com.practice.interfaceexample.strategy.RubberDuck;
import com.practice.interfaceexample.strategy.SimpleFly;
import com.practice.interfaceexample.strategy.SimpleQuack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    UserPresenter userPresenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userPresenter = new UserPresenter(getApplicationContext(), MainActivity.this);
        Button update= (Button) findViewById(R.id.button);
        Button delete= (Button) findViewById(R.id.button1);

        Phone p = new PhoneBuilder().setBattery(3000).setRam(2).getPhone();


        Duck duck = new Duck(new SimpleFly(),new NoQuack());
        duck.setFly();
        duck.setQuack();
        RubberDuck rbduc = new RubberDuck(new Duck(new JetFly(),new SimpleQuack()));
        rbduc.duck.setFly();
        rbduc.duck.setQuack();



        ConcreteObservable concreteObservable = new ConcreteObservable();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteObservable);
        concreteObservable.add(concreteObserver);
        concreteObservable.notif();
        concreteObserver.display();
        concreteObservable.temp = 30;
        concreteObservable.notif();
        concreteObserver.display();

        Beverages b= new Caramel(new Tea());
        Log.e("Usama" ,"" +b.cost());

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("Dog");
        animal.run();


        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        Light l = new Light();
        Invoker invoker = new Invoker(new LightOnCommand(l),new LightOffCommand(l),new LightUpCommand(l),new LightDownCommand(l));
        invoker.ClickOn();
        invoker.ClickOff();
        invoker.ClickUp();
        invoker.UndoClickUp();
        invoker.ClickOff();


        ITarget iTarget = new Adapter(new Adaptee());
        iTarget.request();

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.button:
                // yaha s call howa presenter user ka
                userPresenter.updateUser(new User());
                break;
            case R.id.button1:
                userPresenter.deleteUser(new User());
                break;

            case R.id.btn_service_call:
                Intent serviceCall = new Intent(getApplicationContext(), ServiceExample.class);
                startService(serviceCall);
                break;

            default:
                break;
        }
    }


}
