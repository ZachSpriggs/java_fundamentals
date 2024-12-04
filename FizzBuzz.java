import java.util.List;
public class FizzBuzz {
    public List<String> fizzBuzz(int num){
        // implement solution here
        List<String> list = new List<String>();
        for(int i = 1; i < num; i++){
          if(i % 3 == 0){
            list.add("red");
          } if(i % 5 == 0){
            list.add("fin");
          } if (i % 3 == 0 && i % 5 == 0){
            list.add("redfin");
          } else {
            list.add(Integer.toString(i));
          }
        }
        return list;
      }
  }
