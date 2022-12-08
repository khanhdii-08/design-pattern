import composite_pattern.Employee;
import decorator_pattern.Circle;
import decorator_pattern.Rectangle;
import decorator_pattern.RedShapeDecorator;
import decorator_pattern.Shape;


public class Main {
    public static void main(String[] args) {

//        EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
//        instance.showMessage();
//        LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
//        instance.showMessage();

//        ShapeFactory shapeFactory = new ShapeFactory();
//
//        Shape shape1 = shapeFactory.getShape("");
//        shape1.draw();

//        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
//        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
//        Color color1 = colorFactory.getColor("BLUE");
//        color1.fill();

//        Student student = new StudentBuilder().name("duy").age(21).email("duy@gmail.com").build();
//        System.out.println(student);

//        PolarGraph polarGraph = new PolarGraph();
//        IGraph graph = new PolarGraphAdapter(polarGraph);
//        graph.Point(3, 4);

//        VideoData videoData = new VideoData("a", "b");
//        Youtube youtube = new Youtube(videoData);
//        Facebook facebook = new Facebook(videoData);
//        videoData.setLink("c");

//        Context context = new Context();
//        StartState startState = new StartState();
//        startState.doAction(context);
//        System.out.println(context.getState().toString());
//
//        StopState stopState = new StopState();
//        stopState.doAction(context);
//        System.out.println(context.getState().toString());

//        Shape circle = new Circle();
//
//        Shape redCircle = new RedShapeDecorator(new Circle());
//
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
//        System.out.println("Circle with normal border");
//        circle.draw();
//
//        System.out.println("\nCircle of red border");
//        redCircle.draw();
//
//        System.out.println("\nRectangle of red border");
//        redRectangle.draw();

        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
//        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee + "1");

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }


}