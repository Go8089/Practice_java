package dsa;

public class ReverseSingleLinkList {
 int data;
 ReverseSingleLinkList adr;
  ReverseSingleLinkList(int data)
  {
	  this.data = data;
	  this.adr = null;
  }
  
  public void insert(ReverseSingleLinkList send, int val)
  {       
		  send.adr = new ReverseSingleLinkList(val);
		  send = send.adr;
  }
 
  public static void main(String[] args)
  {
	  ReverseSingleLinkList obj = new  ReverseSingleLinkList(2);
	  ReverseSingleLinkList send = obj;
	  ReverseSingleLinkList head = obj;
	  ReverseSingleLinkList store = obj;
	  ReverseSingleLinkList stores = obj;
	  obj.insert(send,5);
	  /*for(int i = 3 ; i<=24; i = i*2)
	  {
		  obj.adr = new ReverseSingleLinkList(i);
		  obj = obj.adr;
		  System.out.println(obj.data);
	  }*/
	 /* ReverseSingleLinkList head = obj;
	  ReverseSingleLinkList store = obj;
	  ReverseSingleLinkList rel;
	  int i= 1;
	  while(head.adr!=null)
	  {
		  
		  rel = head.adr;
		  if (i == 1)
		  obj.adr = null;
		  head = head.adr;
		  if(i != 1)
		  obj.adr = rel;
		  i++;
	  }
	  while(head.adr != null)
	  {
		  System.out.println(obj.data);
		  head = head.adr;
	  }*/
	/*  int i = 1;
	  do
	  {
		  System.out.println(head.data); 
		  head = head.adr;
		  i++;
	  }while(head.adr!= null);
	  if(i % 2 == 0)
	  {
		  for (int j = 1; j <= ((i/2) + 1); j++ )
		  {
			 if(j == ((i/2) + 1)) 
			 {
				System.out.print(store.data) ;
			 }
			 store = store.adr;
		  }
	  } else
	  {
		  for (int j = 1; j <= ((i/2) + 1); j++ )
		  {
			 if(j == ((i/2) + 1)) 
			 {
				System.out.print(stores.data) ;
			 }
			 stores = stores.adr;
		  }
	  }*/
	  
  }
}
//WAP to implement ll
/*
 * insert
 * delete
 * search
 * show 
 */
