package com.practice.interfaceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.practice.interfaceexample.AbstractFactoryDesign.AbstractFactory;
import com.practice.interfaceexample.AbstractFactoryDesign.FactoryProducer;
import com.practice.interfaceexample.AbstractFactoryDesign.Shape;
import com.practice.interfaceexample.Facade.ShapeFacade;
import com.practice.interfaceexample.FactoryDesign.Animal;
import com.practice.interfaceexample.FactoryDesign.AnimalFactory;
import com.practice.interfaceexample.Iterator.Iterator;
import com.practice.interfaceexample.Iterator.NameRepository;
import com.practice.interfaceexample.TemplateMethodPattern.AdminUser;
import com.practice.interfaceexample.TemplateMethodPattern.NormalUser;
import com.practice.interfaceexample.TemplateMethodPattern.Record;
import com.practice.interfaceexample.adapter.Adaptee;
import com.practice.interfaceexample.adapter.Adapter;
import com.practice.interfaceexample.adapter.ITarget;
import com.practice.interfaceexample.bridge.Circle;
import com.practice.interfaceexample.bridge.GreenCircle;
import com.practice.interfaceexample.builder.Phone;
import com.practice.interfaceexample.builder.PhoneBuilder;
import com.practice.interfaceexample.command.Invoker;
import com.practice.interfaceexample.command.Light;
import com.practice.interfaceexample.command.LightDownCommand;
import com.practice.interfaceexample.command.LightOffCommand;
import com.practice.interfaceexample.command.LightOnCommand;
import com.practice.interfaceexample.command.LightUpCommand;
import com.practice.interfaceexample.composite.Project;
import com.practice.interfaceexample.composite.Todo;
import com.practice.interfaceexample.composite.TodoList;
import com.practice.interfaceexample.decorator.Beverages;
import com.practice.interfaceexample.decorator.Caramel;
import com.practice.interfaceexample.decorator.Tea;
import com.practice.interfaceexample.mvp.presenter.presenter.model.User;
import com.practice.interfaceexample.observer.ConcreteObservable;
import com.practice.interfaceexample.observer.ConcreteObserver;
import com.practice.interfaceexample.mvp.presenter.presenter.ServiceExample;
import com.practice.interfaceexample.mvp.presenter.presenter.UserPresenter;
import com.practice.interfaceexample.proxy.IBookParser;
import com.practice.interfaceexample.proxy.LazyBookParserProxy;
import com.practice.interfaceexample.state.Conteext;
import com.practice.interfaceexample.strategy.Duck;
import com.practice.interfaceexample.strategy.JetFly;
import com.practice.interfaceexample.strategy.NoQuack;
import com.practice.interfaceexample.strategy.RubberDuck;
import com.practice.interfaceexample.strategy.SimpleFly;
import com.practice.interfaceexample.strategy.SimpleQuack;

import java.util.ArrayList;
import java.util.List;

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


        //Strategy Pattern
        Duck duck = new Duck(new SimpleFly(),new NoQuack());
        duck.setFly();
        duck.setQuack();
        RubberDuck rbduc = new RubberDuck(new Duck(new JetFly(),new SimpleQuack()));
        rbduc.duck.setFly();
        rbduc.duck.setQuack();


        //Observer Pattern
        ConcreteObservable concreteObservable = new ConcreteObservable();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteObservable);
        concreteObservable.add(concreteObserver);
        concreteObservable.notif();
        concreteObserver.display();
        concreteObservable.temp = 30;
        concreteObservable.notif();
        concreteObserver.display();


        //Decorator Pattern
        Beverages b= new Caramel(new Tea());
        Log.e("Usama" ,"" +b.cost());


        //FactoryPattern
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("Dog");
        animal.run();


        //Abstract Factory Pattern
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

       //Command Pattern
        Light l = new Light();
        Invoker invoker = new Invoker(new LightOnCommand(l),new LightOffCommand(l),new LightUpCommand(l),new LightDownCommand(l));
        invoker.ClickOn();
        invoker.ClickOff();
        invoker.ClickUp();
        invoker.UndoClickUp();
        invoker.ClickOff();


        //Adapter Pattern
        ITarget iTarget = new Adapter(new Adaptee());
        iTarget.request();

        //Facade Pattern
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawSquare();
        shapeFacade.drawRectangle();

        //Proxy Pattern
        IBookParser iBookParser = new LazyBookParserProxy("AABCCC");
        iBookParser.getnumberofPages();


        //Bridge Pattern
        com.practice.interfaceexample.bridge.Shape shape = new Circle(5,new GreenCircle());
        shape.draw();


        //Template MEthod Pattern
        NormalUser u = new NormalUser();
        u.save();
        AdminUser au = new AdminUser();
        au.save();


        //Composite Pattern
        List<TodoList> todoLists2 = new ArrayList<>();
        todoLists2.add(new Todo("Third First"));
        todoLists2.add(new Todo("Third Second"));
        List<TodoList> todoLists = new ArrayList<>();
        todoLists.add(new Todo("Sub First"));
        todoLists.add(new Project("Sub Second",todoLists2));
        List<TodoList> todoLists1 = new ArrayList<>();
        todoLists1.add(new Todo ("Second First"));
        todoLists1.add(new Todo ("Second Second"));
        TodoList t3 = new Project("First",todoLists);
        TodoList t4 = new Project("Second",todoLists1);
        Todo t5 = new Todo("Third");
        Todo t6 = new Todo("Fourth");
        Log.i("Usama",t3.getHtml());
        Log.i("Usama",t4.getHtml());
        Log.i("Usama",t5.getHtml());
        Log.i("Usama",t6.getHtml());


        //Custom Toast
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast,
                (ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.FILL_HORIZONTAL|Gravity.BOTTOM,0,0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


        //Iterator Pattern
        NameRepository nameRepository = new NameRepository();
        for(Iterator iterator = nameRepository.getIterator();iterator.hasNext();)
        {
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }

        //State Pattern
        Conteext conteext = new Conteext();
        conteext.action();







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
