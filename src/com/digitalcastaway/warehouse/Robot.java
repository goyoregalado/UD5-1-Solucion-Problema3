package com.digitalcastaway.warehouse;

import com.digitalcastaway.datastructures.GenericStack;
import com.digitalcastaway.utils.RobotUtils;

public class Robot {
    private String name;
    private GenericStack<Product> storage = new GenericStack<Product>();

    public Robot(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        storage.push(product);
    }

    public int getNumProducts() {
        return storage.getLength();
    }

    public Product removeProduct() {
        return storage.pop();
    }

    public static Robot generateRobot() {
        String robotName = RobotUtils.generarNombreRobot();

        Robot newRobot = new Robot(robotName);

        int numProducts = (int) (Math.random() * 5) + 1;

        for (int i = 0; i < numProducts; i++) {
            newRobot.addProduct(Product.generateProduct());
        }

        return newRobot;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
