/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Patiwet
 */
public class SinglyLinkedList {
    Node head;
    String listName;
    
    public SinglyLinkedList(String name){
        listName=name;
    }
    
    public void popBack() {
        if (isEmpty()){
            System.out.println("Error");
        }else{
            Node tmp=head;
            Node preTmp=head;
            while(tmp.next!=null){
                preTmp=tmp;
                tmp=tmp.next;
            }preTmp.next=null;
        }
    }
    
    public void popFront(){
        if (isEmpty()){
 
        }else{

        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node topBack(){ 
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){head=node;

        }else {
            node.next=head;
            head=node;
        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()){head = node;

        } else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){

    }
    
    public void addNodeBefore(Node node1, Node node2){

    }
    
    public boolean isEmpty(){
        if(head==null) return true;
        else return false;
    }
    public void merge(SinglyLinkedList list){
        
    }
    
    public void printStructure(){
        System.out.print(listName+":head <->");
        Node temp=head;
        while(temp.next!=null){
            System.out.print(" ["+temp.student_id+"] <->");
            temp=temp.next;
        }System.out.println(" ["+temp.student_id+"] <-> tail");


    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node();
        } else {
            return new Node();
        }
    }
}
