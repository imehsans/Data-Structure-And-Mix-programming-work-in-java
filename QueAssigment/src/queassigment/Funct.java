/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queassigment;

/**
 *
 * @author Ehsan Jadoon
 */
public class Funct {
    int size=0;
    int s=0;
    int[] a= new int[5];
    void enQueue(int data){
       a[s] =data;
        System.out.println("|"+a[s]+"|"+"  enqeued");
        size++;
        s++;
    }
    int n=0;
    void deQueue(){        System.out.println(">>>"+a[n]+"   deqeued");
        n++;
        size--;}
    void display(){
        int i=0;
        System.out.print("remaing data:  <");
        while( i!=size){
            System.out.print(a[n]+"<-");
                    i++;        
        }
    }
    
}
