class Rose

{

public static void main(String args[])

{

int i=0;

try

{

if (args.length == 0) {

return;

}else{

int x=Integer.parseInt(args[i]);

try{

x =x/0;

}catch (ArithmeticException e) {

System.out.print("Divied by 0, ");

} finally {

System.out.print("Try again, ");

}

}

} finally {

System.out.print("Outer Try");

}

}

}