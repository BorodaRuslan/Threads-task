package task_01;



public class Main {

    public static void main(String[] args) {

        String name = "Robot 1.0";
        getRobotInfo(getRobot(name));

        String name1 = "Robot 2.0";
        getRobotInfo(getRobot(name1));
    }

    private static Robot getRobot(String name) {
       return new Robot(name);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot.getName() + " state: " + robot.getState());
        robot.start();
        System.out.println(robot.getName() + " state: " + robot.getState());
    }
}
