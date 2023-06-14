package service;

import domain.*;

import static service.Data.*;
/**
 * 項目信息
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
//      根据项目提供的Data类构建相应大小的employees数组
//      再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
//      将对象存于数组中
//      Data类位于com.atguigu.team.service包中
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < EMPLOYEES.length; i++ ){
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER;
                    equipment = CreateEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                case DESIGNER:
                    equipment = CreateEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment,bonus);
                case ARCHITECT:
                    equipment = CreateEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment,bonus,stock);
            }

        }
    }

    private Equipment CreateEquipment(int index) {

        int key = Integer.parseInt(EQUIPMENTS[index][0]);
        String modelOrName = EQUIPMENTS[index][1];
        switch (key) {
            case PC: //21
                String display = EQUIPMENTS[index][2];
                return new domain.PC(modelOrName,display);
            case NOTEBOOK: //22
                double price = Double.parseDouble(EQUIPMENTS[index][2])
                return new NoteBook(modelOrName,price);
            case PRINTER: //23
                String name = EQUIPMENTS[index][1];
                String type = EQUIPMENTS[index][2];
                return new domain.Printer(name,type);
        }
    }


    public Employee[] getEmployees() {
        return employees;
    }

}
