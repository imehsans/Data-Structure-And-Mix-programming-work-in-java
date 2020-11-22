/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queassig;

/**
 *
 * @author Ehsan Jadoon
 */
public class Funct  {
  qnode front, rear; 
    int size;
      void enqueue(int d) 
           
    { 
            size++;
       
        qnode newq = new qnode(); 
       newq.data=d;
      
        if (rear == null) 
        { 
           front = rear = newq; 
          
        } 
        else{
        rear.next = newq; 
       rear=rear.next;
    } }
      void print(){
        qnode temp=front;
         while(temp.next!=null){
             System.out.println(temp.data);
             temp=temp.next; 
         }
          System.out.println(temp.data);
       
      } 
       void deqeue(){
            qnode temp=front;
            size--;
             if (front == null) 
        { 
           front = rear = null; 
          
        } 
             else{
                temp= front.next;
                 front=temp;
             } 
       }
}
