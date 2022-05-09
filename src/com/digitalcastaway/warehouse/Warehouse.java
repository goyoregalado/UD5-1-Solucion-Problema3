package com.digitalcastaway.warehouse;

import com.digitalcastaway.datastructures.GenericQueue;

public class Warehouse {
    private String name;
    private GenericQueue<Robot> robotQueue;

    public Warehouse(String name) {
        this.name = name;
        robotQueue = new GenericQueue<Robot>();
    }

    public void addRobot(Robot robot) {
        System.out.println("Adding robot: " + robot.getName());
        robotQueue.enqueue(robot);
    }

    public Robot removeRobot() {
        Robot robot = robotQueue.dequeue();
        System.out.println("Removing robot " + robot.getName() + " from queue");
        while (robot.getNumProducts() > 0 ) {
            System.out.println("\t" + robot.removeProduct());
        }
        return robot;
    }

    public static Warehouse generateWarehouse() {
        Warehouse myWarehouse = new Warehouse("Goyocen");

        for (int i = 0; i < 5; i++) {
            myWarehouse.addRobot(Robot.generateRobot());
        }
        return myWarehouse;
    }
}
