class Test {
    public static void main(String[] args) {
        String st = "pro@st#ack9191";
        
        String cleanedString = st.replaceAll("[^a-zA-Z0-9]", "");  //prostack9191
        
        System.out.println(cleanedString); 
    }
}