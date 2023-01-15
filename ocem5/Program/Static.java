class StaticMemberOutside {
    int i = 10;
    static int j = 20;
    static int add(){
        return 5+10;
    }
    
    int subtract(){
        return 10-5;
    }
}


class AnotherClass {
    public static void main(String[] args){
    	StaticMemberOutside som = new StaticMemberOutside();
    	System.out.println(som.i);
    	System.out.println(StaticMemberOutside.j);
    }
}