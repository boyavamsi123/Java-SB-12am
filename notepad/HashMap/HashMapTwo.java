import java.util.HashMap;


class Main{
   public static void main(String[] args){
      HashMap<String, String> capitalCities = new HashMap<String, String>();

      capitalCities.put("England", "London");
      capitalCities.put("Germany", "Berlin");
      capitalCities.put("Norway", "Oslo");
      capitalCities.put("USA", "Washington DC");

      //capitalCities.get("England");	

      //capitalCities.remove("England");

      //capitalCities.clear();

      capitalCities.size();

      System.out.println(capitalCities);

      System.out.println("============================");

      System.out.println(capitalCities.size());
       
      System.out.println("============================");
      
      for (String i : capitalCities.keySet()) {
         System.out.println(i);
      }

      System.out.println("============================");

      for (String i : capitalCities.values()) {
         System.out.println(i);
      }

      System.out.println("============================");

      for (String i : capitalCities.keySet()) {
         System.out.println("key: " + i + " value: " + capitalCities.get(i));
      }
}
}