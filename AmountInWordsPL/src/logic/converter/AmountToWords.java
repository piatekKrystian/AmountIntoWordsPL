package logic.converter;

public class AmountToWords {
	    

	    public static String wartoscTekstowo(int liczba) {
	        return miliony(liczba)+" "+zlote(liczba);
	    }

	    public static String cyfry(int cyfra) {
	        switch (cyfra) {
	            case 0:
	                return "zero";
	            case 1:
	                return "jeden";
	            case 2:
	                return "dwa";
	            case 3:
	                return "trzy";
	            case 4:
	                return "cztery";
	            case 5:
	                return "pięć";
	            case 6:
	                return "sześć";
	            case 7:
	                return "siedem";
	            case 8:
	                return "osiem";
	            case 9:
	                return "dziewięć";
	            case 10:
	                return "dziesięć";
	            default:
	                return "";
	        }
	    }

	    public static String nastki(int liczba) {
	        if (liczba <= 10) {
	            return cyfry(liczba);
	        } else {
	            int x = liczba % 10;
	            switch (liczba) {
	                case 11:
	                    return "jedenaście";
	                case 14:
	                    return "czternaście";
	                case 15:
	                    return "piętnaście";
	                case 16:
	                    return "szesnaście";
	                case 19:
	                    return "dziewiętnaście";
	                default:
	                    return cyfry(x) + "naście";
	            }
	        }
	    }

	    public static String dziesiatki(int liczba) {
	        if (liczba < 20) {
	            return nastki(liczba);
	        } else {
	            int x = liczba / 10;
	            int y = liczba % 10;
	            if (liczba >= 20 && liczba < 30) {
	                if (y == 0) {
	                    return cyfry(x) + "dzieścia";
	                } else {
	                    return cyfry(x) + "dzieścia" + " " + cyfry(y);
	                }
	            } else if (liczba >= 30 && liczba < 40) {
	                if (y == 0) {
	                    return "trzydzieści";
	                } else {
	                    return "trzydzieści" + " " + cyfry(y);
	                }
	            } else if (liczba >= 40 && liczba < 50) {
	                if (y == 0) {
	                    return "czterdzieści";
	                } else {
	                    return "czterdzieści" + " " + cyfry(y);
	                }
	            } else {
	                if (y == 0) {
	                    return cyfry(x) + "dziesiąt";
	                } else {
	                    return cyfry(x) + "dziesiąt" + " " + cyfry(y);
	                }
	            }
	        }
	    }

	    public static String setki (int liczba) {
	        if (liczba < 100) {
	            return dziesiatki(liczba);
	        } else {
	            int x = liczba / 100;
	            int y = liczba%100;

	            if (liczba >= 100 && liczba < 200) {
	                if (liczba==100){
	                    return "sto";
	                }else{
	                    return "sto"+" "+dziesiatki(y);
	                }
	            } else if (liczba >= 200 && liczba < 300) {
	                if (liczba==200){
	                    return "dwieście";
	                }else{
	                    return "dwieście"+" "+dziesiatki(y);
	                }
	            } else if (liczba >= 300 && liczba < 500) {
	                if (y==0){
	                    return cyfry(x)+"sta";
	                }else{
	                    return cyfry(x)+"sta"+ " " +dziesiatki(y);
	                }
	            } else  {
	                if (y==0){
	                    return cyfry(x)+"set";
	                }else{
	                    return cyfry(x)+"set"+ " " +dziesiatki(y);
	                }
	            }

	        }
	    }
	    public static String tysiace (int liczba){
	        int x= liczba/1000;
	        int y = x%10;
	        int z = liczba%1000;
	        String ending = "";
	        if (liczba<1000){
	            return setki(liczba);
	        }else {
	            if (x == 1) {
	                ending = " tysiąc";
	            }else if (x==11||x==12||x==13||x==14){
	                ending =" tysięcy";
	        }else if(y==2 || y==3|| y==4){
	                ending = " tysiące ";
	            } else {
	                ending = " tysięcy ";
	            }
	        }
	        if (z==0){
	            return setki(x)+ending;
	        }else {
	            return setki(x) + ending + setki(z);
	        }

	    }

	    public static String miliony (int liczba){
	        int x= liczba/1000000;
	        int y = x%10;
	        int z = liczba%1000000;
	        String ending = "";
	        if (liczba<1000000){
	            return tysiace(liczba);
	        }else {
	            if (x == 1) {
	                ending = " milion ";
	            }else if (x==11||x==12||x==13||x==14){
	                ending =" milionów";
	            }else if(y==2 || y==3|| y==4){
	                ending = " miliony ";
	            } else {
	                ending = " milionów ";
	            }
	        }
	        if (z==0){
	            return setki(x)+ending;
	        }else {
	            return setki(x) + ending + tysiace(z);
	        }

	    }

	    public static String zlote (int liczba){
	        int x = liczba%10;
	      if (liczba==1){
	          return "złoty";
	      }else if(liczba==12||liczba==13||liczba==14){
	          return "złotych";
	        }else if(x==2||x==3||x==4){
	          return "złote";
	      }else{
	          return "złotych";
	      }
	    }



	}

