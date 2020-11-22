/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queusingarray;

/**
 *
 * @author Ehsan Jadoon
 */
public class QueUsingArray {
    private int Range;
    int[] queArr;
    int front = 0;
    int rear = -1;
    int currentSize = 0;
    public QueUsingArray(int queueSize){
        this.Range = queueSize;
        queArr = new int[this.Range];}
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow!");
        } else {
            rear++;
            if(rear == Range-1){
                rear = 0;}
            queArr[rear] = item;
            currentSize++;
            System.out.println("Element " + item+ " is Enqueue to Queue !");}}
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow !");
        } else {
            front++;
            if(front == Range-1){
                System.out.println("De_Que operation done ! removed: "+queArr[front-1]);
                front = 0;
            } else {
                System.out.println("De_Que operation done ! removed: "+queArr[front-1]);}
            currentSize--;}}
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == Range){
            status = true;}
        return status;}
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;}
        return status;}
    
    public static void main(String a[]){     
        QueUsingArray queue = new QueUsingArray(5);
        queue.enqueue(40);
        queue.dequeue();
        queue.enqueue(86);
        queue.enqueue(27);
        queue.enqueue(27);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(274);
        queue.dequeue();
        queue.enqueue(8);
        queue.enqueue(65);
        queue.enqueue(253);
        queue.enqueue(45);}}


