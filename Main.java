public Main{
public static void main(String[] args){
	Try{
	while(args.lenth!=0){
	ArrayList<String> array=new ArrayList<String>();
	array.add(args);
	for(String arg:array){
		System.out.println(arg);
		}
}
		}catch(Exception e){
		Ssystem.out.println("error: "+e);
}
	}
}
