import java.util.Scanner;

public class Hi{
  public static void main(String args[]){
      DataStorage data = new DataStorage();

      data.write();
      data.read(); 
  }
}

class DataStorage{
    private String[] arr = new String[5];
    private int index = 0;

    protected void write(){
        System.out.println("write "+arr.length+" tokens");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine() && index<5 ){ //&& index>=5
            String temp = sc.next();
            arr[index]=temp;
            index++;

            System.out.println("saved "+temp);
        }
    }

    protected void read(){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}