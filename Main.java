/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * @author Patiwet
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Node node;
        SinglyLinkedList list1;
        DoublyLinkedList list2;
        list1 = new SinglyLinkedList("Hello World!");
       // list1.pushBack(node = new Node(1111,"oooo",4.55));
        list1.pushBack(node = new Node(6969,"kuy",4.55));
        //list1.printStructure();
        //list1.popBack();
        //list1.printStructure();
        list1.pushFront(node = new Node(22222,"kuygest",4.55));
        list1.pushFront(node = new Node(2333,"kuygest",4.55));
        list1.printStructure();

        list2 = new DoublyLinkedList("Hello World!");
    }
}
