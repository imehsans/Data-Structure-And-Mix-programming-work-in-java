/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularque;

/**
 *
 * @author Ehsan Jadoon
 */
public class Funct {
    node first=null;
    node last=null;
    int c=0;
     public void insertFirst(int x)
 {
  node newNode=new node();
  c++;
 newNode.data=x;
  newNode.next=null; 
  if(first==null)
  first= last=newNode;
  else if(c>=5){
  last.next=newNode;
  newNode.next=first.next;
  }
  else
   first.pre=newNode;
  newNode.next=first;
  first=newNode;
  last.next=first.pre;
 }
  
      public void deleteFirst()
 {
  if(first.next==null)
   last=null;
  else
   first.next.pre=null;
  first=first.next;
c--;
 }
  public void displayall()
 {
    int h=0;
  node current=first;
  while(h!=c)
  {
   current.displayNode();
   current=current.next;
   h++;
  }
  
 }
}