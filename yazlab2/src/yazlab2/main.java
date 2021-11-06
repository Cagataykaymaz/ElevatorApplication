package yazlab2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class main {
    
    

	        static int asansorunkati,asansorunkati2,asansorunkati3,asansorunkati4,asansorunkati5;
		//static int kapasite;
		static boolean cikisyapacakmusteri=false,cikisyapacakmusteri2=false,cikisyapacakmusteri3=false,cikisyapacakmusteri4=false,cikisyapacakmusteri5=false;
		static boolean asagi,asagi2,asagi3,asagi4,asagi5;
		static boolean yukari=true,yukari2=true,yukari5=true,yukari3=true,yukari4=true;
                static boolean aktif2=false;
                static boolean aktif3=false;
                static boolean aktif4=false; 
                static boolean aktif5=false;
                  
		static boolean [] aktifmi=new boolean[5];
		static boolean [] asansorcalistimi=new boolean[4];
		static ArrayList<Integer>kat=new ArrayList<>();
		static ArrayList<Integer>asansor=new ArrayList<>();
		static ArrayList<Integer>asansor2=new ArrayList<>();
		static ArrayList<Integer>asansor3=new ArrayList<>();
		static ArrayList<Integer>asansor4=new ArrayList<>();
		static ArrayList<Integer>asansor5=new ArrayList<>();
	   	static int [] indextut=new int[100];
		static int sayi=0;
		static boolean asansoraktifmi[]=new boolean[5];
		static int giren_sayisi=0;
		static int gireningidecegikat=0;
		static ArrayList<Integer>arr_girenkuyrugu=new ArrayList<>();
	        static int kat_1=0,kat_2=0,kat_3=0,kat_4=0;
		static int [] katdizisi=new int[5];
		static int [] katdizisitutucu=new int[5];
		static int cikanmusterisayisi=0;
		static int cikaninkati=0,cikaninkati2=0,cikaninkati3=0,cikaninkati4=0,cikaninkati5=0;
		static int [] yardimcidizi=new int[5];
		static int [][] yazdirma_array=new int[5][];
                static int a=0;
                static JLabel label2= new JLabel();
                static JLabel label1= new JLabel();
                static JLabel label3= new JLabel();
                static JLabel label4= new JLabel();
                static JLabel label5= new JLabel();
                static JLabel label6= new JLabel();
                static JLabel label7= new JLabel();
                static JLabel label8= new JLabel();
                static JLabel label9= new JLabel();
                static JLabel label10= new JLabel();
                static JLabel label11= new JLabel();
                static JLabel label12= new JLabel();
                static JLabel label13= new JLabel();
                static JLabel label14= new JLabel();
                static JLabel label15= new JLabel();
                static JLabel label16= new JLabel();
                static JLabel label17= new JLabel();
                static JLabel label18= new JLabel();
                static JLabel label19= new JLabel();
                static JLabel label20= new JLabel();
                static JLabel label21= new JLabel();
                static JLabel label22= new JLabel();
                static JLabel label23= new JLabel();
                static JLabel label24= new JLabel();
                static JLabel label25= new JLabel();
                static JLabel label26= new JLabel();
                static JLabel label27= new JLabel();
                static JLabel label28= new JLabel();
                static JLabel label29= new JLabel();
                static JLabel label30= new JLabel();
                static JLabel label50=new JLabel();
                static JLabel label51= new JLabel();
                static JLabel label52= new JLabel();
                static JLabel label53= new JLabel();
                static JLabel label54= new JLabel();
                static JLabel label60=new JLabel();
                static JLabel label61= new JLabel();
                static JLabel label62= new JLabel();
                static JLabel label63= new JLabel();
                static JLabel label70=new JLabel();
                static JLabel label71= new JLabel();
                static JLabel label72= new JLabel();
                static JLabel label73= new JLabel();
                static JLabel label80=new JLabel();
                static JLabel label81= new JLabel();
                static JLabel label82= new JLabel();
                static JLabel label83= new JLabel();
                static JLabel label90=new JLabel();
                static JLabel label91= new JLabel();
                static JLabel label92= new JLabel();
                static JLabel label93= new JLabel();
                static JLabel label100=new JLabel();
                static JLabel label101= new JLabel();
                static JLabel label102= new JLabel();
                static JLabel label103= new JLabel();
               
		static int [][] yazdirmasize_array=new int[5][];
		static ArrayList<Integer>arr_cikis=new ArrayList<>();    
		static ArrayList <Integer>kat_tutucu=new ArrayList<>();  
		static ArrayList <Integer>kat_tutucu2=new ArrayList<>();
		static JFrame frame = new JFrame("Thread");

	        static JPanel panel = new JPanel();
                static JButton button2 = new JButton("SONLANDIR"); 
                static JFrame frame2 = new JFrame("Basladi");
	        static JPanel panel2 = new JPanel();
		static JButton button = new JButton("BAÞLA");
		static boolean []labeltut=new boolean[5];
                

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	    	
	        
	        Thread avmcikis=new Thread(new Runnable(){

	        	
	        	int i=0;
	        	
				@Override
				public void run() {

					sayi=0;
					
					
					while(0<100 && a<1)
					{
						
						int sayi=0;
			        	kat_1=0;
			        	kat_2=0;
			        	kat_3=0;
			        	kat_4=0;
					try
					{
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			                	
			                Random random=new Random();
					cikanmusterisayisi=random.nextInt(5)+1;
					while(i!=1)
	                {
	               
	        cikanmusterisayisi=random.nextInt(5)+1;
	                if(kat.size()<cikanmusterisayisi)
	                    i--;
	                i++;
	                }
						
						
			//             System.out.println("Cikmak isteyen musteri sayisi:"+cikanmusterisayisi);   
			        
					for(int i=0;i<cikanmusterisayisi;i++)
					{
						//System.out.println("hi");
						Random random1=new Random();                    
						cikaninkati=random1.nextInt(4)+1;     
						
						if(sayi==0)
						{
						  
						for(int j=0;j<kat.size();j++)
						{
							
							if(kat.get(j)==1)
							{                   
								kat_1++;
								
							}
							else if(kat.get(j)==2)
							{
								kat_2++;
								
							}
							else if(kat.get(j)==3)
							{
								kat_3++;
								
							}
							else if(kat.get(j)==4)
							{
								kat_4++;
								
						}
						
						}
						sayi++;
						}
						katdizisi[1]=kat_1;
						katdizisi[2]=kat_2;
						katdizisi[3]=kat_3;
						katdizisi[4]=kat_4;
						 
						
						/*if(asansörthreadi.kat.get(cikaninkati).size()==0)
						{
							i--;
						}*/
					
						 if(katdizisi[cikaninkati]==0)
							{
								i--;
								continue;
							}                              
						
						 if(katdizisi[cikaninkati]!=0)
						{
							arr_cikis.add(cikaninkati);
							
					//		System.out.println(" cikmak isteyenlerin þu anki katlari:"+cikaninkati);
							katdizisi[cikaninkati]=katdizisi[cikaninkati]-1;
							if(cikaninkati==1)
								kat_1--;
							else if(cikaninkati==2)
								kat_2--;
							else if(cikaninkati==3)
								kat_3--;
							else if(cikaninkati==4)
								kat_4--;
						}
						 

					}
					for(int i=0;i<5;i++)
						yardimcidizi[i]=0;
					for(int j=1;j<5;j++)
					{
						for(int n=0;n<arr_cikis.size();n++)
						{
						if(arr_cikis.get(n)==j)
						{
							yardimcidizi[j]++;
						}
						}
					}
				//	System.out.println("Cikis kuyruðu boyutu:"+arr_cikis.size());
					System.out.println("1.kattaki dolaþan insan sayisi:"+(katdizisi[1]+yardimcidizi[1]));
					System.out.println("2.kattaki dolaþan insan sayisi:"+(katdizisi[2]+yardimcidizi[2]));
					System.out.println("3.kattaki dolaþan insan sayisi:"+(katdizisi[3]+yardimcidizi[3]));
					System.out.println("4.kattaki dolaþan insan sayisi:"+(katdizisi[4]+yardimcidizi[4]));
					label51.setText("1.kat: "+String.valueOf((katdizisi[1]+yardimcidizi[1]))+" Cýkýs Kuyrugu: "+String.valueOf(yardimcidizi[1]));
                    label52.setText("2.kat: "+String.valueOf((katdizisi[2]+yardimcidizi[2]))+" Cýkýs Kuyrugu: "+String.valueOf(yardimcidizi[2]));
                    label53.setText("3.kat: "+String.valueOf((katdizisi[3]+yardimcidizi[3]))+" Cýkýs Kuyrugu: "+String.valueOf(yardimcidizi[3]));
                    label54.setText("4.kat: "+String.valueOf((katdizisi[4]+yardimcidizi[4]))+" Cýkýs Kuyrugu: "+String.valueOf(yardimcidizi[4]));
			
					}
					
					
				}
	        	
	        });
	        
	       
	        
	        Thread asansor0=new Thread(new Runnable(){

				@Override
				public  void run() {
                                    
					try {
						Thread.sleep(501);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
					}
					while(a<1)
					{
						int []t=new int[5];
						int kapasite=10;
                                                
					label5.setText("Kapasite:"+kapasite);
                                        
                                            System.out.println("Kapasite"+kapasite);
                                            
					if(yukari==true)
					{
	                               label4.setText("Yön:Yukarý");
                                            System.out.println("Yön:Yukarý");
					if(asansorunkati==0 && cikisyapacakmusteri==false)
					{
						label2.setText("Kat:"+asansorunkati);
                                            System.out.println("Kat:"+asansorunkati);
                                                label3.setText("Hedef:"+(asansorunkati+1));
                                            System.out.println("Hedef:"+(asansorunkati+1));
                                            
       
						if(arr_girenkuyrugu.size()<kapasite)
						{
							kapasite=arr_girenkuyrugu.size();

						}

						for(int i=0;i<kapasite;i++)
						{
							asansor.add(arr_girenkuyrugu.get(i)); 
						}
						
						t[0]=0;
						for(int i=1;i<5;i++)
						{
							 t[i]=0;
							for(int j=0;j<kapasite;j++)
							{
								if(asansor.get(j)==i)
								{
									
									t[i]++;
								}
							}


							if(i==1)
								label60.setText("inside:"+t[1]+","+i);
							else if(i==2)
								label61.setText("inside:"+t[2]+","+i);
							else if(i==3)
							label62.setText("inside:"+t[3]+","+i);
							else if(i==4)
								label63.setText("inside:"+t[4]+","+i);
						
						}
						
						
//						
						
						System.out.println("Asansore giren kisi sayisi:"+asansor.size());//SIKINTILI
						label6.setText("Ýçerideki kiþi sayisi:"+asansor.size());
						for(int i=0;i<kapasite;i++)
						{
						
							arr_girenkuyrugu.remove(i);
							i--;
							kapasite--;
						}
						
					}
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					int eklenen=0;
					for(int i=1;i<5;i++)
					{
					
						asansorunkati=i;

                                                label2.setText("Kat:"+asansorunkati);
                                            System.out.println("Kat:"+asansorunkati);
                                         
                                            
						if(i!=4)
                                                    
							label3.setText("Hedef:"+(asansorunkati+1));
					
						for(int j=0;j<asansor.size();j++)
						{
							if(asansor.get(j)==i)
							{    
	                              eklenen++;
								kat.add(i);
								asansor.remove(j); 
								t[i]=t[i]-1;
								if(i==1)
									label60.setText("inside:"+t[1]+","+i);
								else if(i==2)
									label61.setText("inside:"+t[2]+","+i);
								else if(i==3)
								label62.setText("inside:"+t[3]+","+i);
								else if(i==4)
									label63.setText("inside:"+t[4]+","+i);
			//					yazdirmasize_array[0][i]=yazdirmasize_array[0][i]-1;
//								inside_label[0][i-1].setText("inside:"+yazdirmasize_array[0][i]+","+i);
                          //                                System.out.println("inside:"+yazdirmasize_array[0][i]+","+i);
							       kapasite--;                   	                       
								 j--; 	                                       
							}
						
						}
						//System.out.println("Asansorden "+i+".kata giren kisi sayisi:"+eklenen);
						label6.setText("Ýçerideki kiþi sayisi:"+asansor.size());
                                            System.out.println("Ýçerideki kiþi sayýsý:"+asansor.size());
						eklenen=0;
						
					    if(i!=4)
					    {
					    	
						 try
						{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					    }
					}
					
					
						
					if(asansorunkati==4)
					{
						
						yukari=false;
						asagi=true;
					}
					
					}
					if(asagi==true)
					{
						label4.setText("Yön:Asagi");
                                            System.out.println("Yön:Asagi");
						kapasite=10;
						
						
						for(int i=4;i>0;i--)
						{
							
							asansorunkati=i;
							label2.setText("Kat:"+asansorunkati);
                                                        System.out.println("Kat:"+asansorunkati);
							label3.setText("Hedef:"+(asansorunkati-1));
                                                        System.out.println("Hedef:"+(asansorunkati-1));
				
							for(int j=0;j<arr_cikis.size();j++)
							{
								
								if(arr_cikis.get(j)==i)
								{
									asansor.add(arr_cikis.get(j));
									t[i]=t[i]+1;
									if(i==1)
										label60.setText("inside:"+t[1]+","+i);
									else if(i==2)
										label61.setText("inside:"+t[2]+","+i);
									else if(i==3)
									label62.setText("inside:"+t[3]+","+i);
									else if(i==4)
										label63.setText("inside:"+t[4]+","+i);
			//						yazdirmasize_array[0][i]+=1;
//									inside_label[0][i-1].setText("inside:"+yazdirmasize_array[0][i]+",0");
                          //                                     System.out.println("inside:"+yazdirmasize_array[0][i]+",0");
									arr_cikis.remove(j);
									j--;
									kapasite--;
									
								}
							}
						        label6.setText("Ýçerideki kiþi sayisi:"+asansor.size());
							System.out.println("Ýçerideki kiþi sayisi:"+asansor.size());
							if(kapasite==0)
								break;
							
							
							try
							{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						}
						
	                    
						asansorunkati=0;
						label2.setText("Kat:"+asansorunkati);
                                            System.out.println("Kat:"+asansorunkati);
						for(int i=0;i<asansor.size();i++)
						{
							asansor.remove(i);
						     i--;
						}
				        	label6.setText("Ýçerideki kiþi sayisi:"+asansor.size());
                                            System.out.println("Ýçerideki kiþi sayisi:"+asansor.size());
					
							kapasite=10;
							cikisyapacakmusteri=false;
							asagi=false;
							yukari=true;

					}
				}
				}
	        });
	        
	     Thread asansor1=new Thread(new Runnable(){

			@Override
			public  void  run() {
				// TODO Auto-generated method stub
				//System.out.println("hihihihi");
				
				while(a<1)
				{
					int [] t0=new int[5];
                                    System.out.print("");
					if(aktif2==true)
                                        {
					int kapasite2=10;
	                                label11.setText("Kapasite:"+kapasite2);
                                    System.out.println("2.asansör - Kapasitesi:"+kapasite2);
					
				if(yukari2==true)
				{
	                       label10.setText("Yön:Yukarý");
                                    System.out.println("2.asansör - Yön:Yukari");
				if(asansorunkati2==0 && cikisyapacakmusteri2==false)
				{
					label8.setText("Kat:"+asansorunkati2);
                                    System.out.println("2.asansör - Kat:"+asansorunkati2);
					label9.setText("Hedef:"+(asansorunkati2+1));
                                    System.out.println("2.asansör - Hedef:"+(asansorunkati2+1));
					
					if(arr_girenkuyrugu.size()<kapasite2)
					{
						
						kapasite2=arr_girenkuyrugu.size();
						
						
					}
					for(int i=0;i<kapasite2;i++)
					{
						asansor2.add(arr_girenkuyrugu.get(i)); 

					}
					label12.setText("Ýçerideki kiþi sayisi:"+asansor2.size());
					System.out.println("2.asansör - Ýçerideki kisi sayisi:"+asansor2.size());
					t0[0]=0;
					for(int i=1;i<5;i++)
					{
						 t0[i]=0;
						for(int j=0;j<kapasite2;j++)
						{
							if(asansor2.get(j)==i)
							{
								
								t0[i]++;
							}
							
						}
						if(i==1)
							label70.setText("inside:"+t0[1]+","+i);
						else if(i==2)
							label71.setText("inside:"+t0[2]+","+i);
						else if(i==3)
						label72.setText("inside:"+t0[3]+","+i);
						else if(i==4)
							label73.setText("inside:"+t0[4]+","+i);
		//				yazdirmasize_array[1][i]=t;
					}
					
					for(int j=1;j<5;j++)
					{
//						inside_label[1][j-1].setText("inside:"+yazdirmasize_array[1][j]+","+j);
                  //                          System.out.println("inside:"+yazdirmasize_array[1][j]+","+j);
					}
					//SIKINTILI
	                                
							
					for(int i=0;i<kapasite2;i++)
					{
						
					//	if(asansor.add(avmgiren.arr_girenkuyrugu.get(i))==true)
						arr_girenkuyrugu.remove(i);
						i--;
						kapasite2--;
					}
					//System.out.println("Asansor kuyruktan alým yaptýktan sonra kiþi sayisi:"+arr_girenkuyrugu.size());
					
				}
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int eklenen=0;
				for(int i=1;i<5;i++)
				{
				
					asansorunkati2=i;
	                               label8.setText("Kat:"+asansorunkati2);
                                    System.out.println("2.asansör - Kat:"+asansorunkati2);
					if(i!=4)
                                        label9.setText("Hedef:"+(asansorunkati2+1));
				
				
					for(int j=0;j<asansor2.size();j++)
					{
						if(asansor2.get(j)==i)
						{    
	                                               eklenen++;
							kat.add(i);
							asansor2.remove(j); 
							t0[i]=t0[i]-1;
							if(i==1)
								label70.setText("inside:"+t0[1]+","+i);
							else if(i==2)
								label71.setText("inside:"+t0[2]+","+i);
							else if(i==3)
							label72.setText("inside:"+t0[3]+","+i);
							else if(i==4)
								label73.setText("inside:"+t0[4]+","+i);
		//					yazdirmasize_array[1][i]=yazdirmasize_array[1][i]-1;
//							inside_label[1][i-1].setText("inside:"+yazdirmasize_array[1][i]+","+i);
		//					System.out.println("inside:"+yazdirmasize_array[1][i]+","+i);
						       kapasite2--;                   	                       
							 j--; 	                                       
						}
					
					}
			
	                                label12.setText("Ýçerideki kiþi sayisi:"+asansor2.size());
                                    System.out.println("2.asansör - Ýçerideki kiþi sayisi:"+asansor2.size());
					
					eklenen=0;
					
				    if(i!=4)
				    {
				    	
					 try
					{
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				    }
				}
				
				
					
				if(asansorunkati2==4)
				{
					
					yukari2=false;
					asagi2=true;
				}
				
				}
				if(asagi2==true)
				{
                                        label10.setText("Yön:Asagi");
                                    System.out.println("2.asansör - Yön:Asagi");
					
					kapasite2=10;
					
					for(int i=4;i>0;i--)
					{
						
						asansorunkati2=i;
	                                        label8.setText("Kat:"+asansorunkati2);
                                            System.out.println("2.asansör - Kat:"+asansorunkati2);
						label9.setText("Hedef:"+(asansorunkati2-1));
                                        System.out.println("2.asansör - Hedef:"+(asansorunkati2-1));

						for(int j=0;j<arr_cikis.size();j++)
						{
							
							if(arr_cikis.get(j)==i)
							{
								asansor2.add(arr_cikis.get(j));
								arr_cikis.remove(j);
								t0[i]=t0[i]+1;
								if(i==1)
									label70.setText("inside:"+t0[1]+","+i);
								else if(i==2)
									label71.setText("inside:"+t0[2]+","+i);
								else if(i==3)
								label72.setText("inside:"+t0[3]+","+i);
								else if(i==4)
									label73.setText("inside:"+t0[4]+","+i);
		//						yazdirmasize_array[1][i]+=1;
                  //                                              System.out.println("inside:"+yazdirmasize_array[1][i]+",0");
//								inside_label[1][i-1].setText("inside:"+yazdirmasize_array[1][i]+",0");
								j--;
								kapasite2--;
								
							}
						}
                                                System.out.println("2.asansör - Ýçerideki kiþi sayisi:"+asansor2.size());
	                                       label12.setText("Ýçerideki kiþi sayisi:"+asansor2.size());
						//System.out.println("Musteri aldýktan sonra asansorun kapasitesi:"+kapasite2);
						if(kapasite2==0)
							break;
						
						
						try
						{
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					}
					
	                
					asansorunkati2=0;
                                        System.out.println("2.asansör - Kat:"+asansorunkati2);
	                                label8.setText("Kat:"+asansorunkati2);
					for(int i=0;i<asansor2.size();i++)
					{
						asansor2.remove(i);
					     i--;
					}
	                                label12.setText("Ýçerideki kiþi sayisi:"+asansor2.size());
					System.out.println("2.asansör - Ýçerideki kiþi sayisi:"+asansor2.size());
						kapasite2=10;
						cikisyapacakmusteri2=false;
						asagi2=false;
						yukari2=true;
					
				
				
				}
		
			
			
			
				
				}
                                }
			}
		
	    	  
	      });
	        Thread asansor2=new Thread(new Runnable(){
	        
	        
				@Override
				public void run() {
                                    
					
					while(a<1)
					{
						int []t1=new int[5];
                                            System.out.print("");
                                            
                                            if(aktif3==true )
                                            {
                                                
	                                    int kapasite3=10;
	                                    label17.setText("Kapasite:"+kapasite3);
                                            System.out.println("3.asansör - Kapasite:"+kapasite3);
					if(yukari3==true)
					{
                                            System.out.println("3.asansör - Yön:Yukarý");
						label16.setText("Yön:Yukarý");
					if(asansorunkati3==0 && cikisyapacakmusteri3==false)
					{
                                            System.out.println("3.asansör - Kat:"+asansorunkati3);
                                            System.out.println("3.asansör - Hedef:"+(asansorunkati3+1));
	                                label14.setText("Kat:"+asansorunkati3);
					label15.setText("Hedef:"+(asansorunkati3+1));
						for(int c=0;c<5;c++)
						{
						//	if(asansoraktifmi[c]==true)
						//label[c].setText("floor:"+String.valueOf(asansorunkati));
						}
						
						if(arr_girenkuyrugu.size()<kapasite3)
						{
							kapasite3=arr_girenkuyrugu.size();
							
						}
						for(int i=0;i<kapasite3;i++)
						{
							asansor3.add(arr_girenkuyrugu.get(i)); 
							//System.out.println(avmgiren.arr_girenkuyrugu.get(i)+"a");
						
						}
	                       label18.setText("Ýçerideki kiþi sayisi:"+asansor3.size());
                                            System.out.println("3.asansör - Ýçerideki kiþi sayisi:"+asansor3.size());
	                       t1[0]=0;
                                            for(int i=1;i<5;i++)
	                	{
	                        t1[i]=0;
	                      for(int j=0;j<kapasite3;j++)
	                	{
	                	if(asansor3.get(j)==i)
	                		{
	                									
	                		t1[i]++;
	                		}
	                	}
	                      if(i==1)
								label80.setText("inside:"+t1[1]+","+i);
							else if(i==2)
								label81.setText("inside:"+t1[2]+","+i);
							else if(i==3)
							label82.setText("inside:"+t1[3]+","+i);
							else if(i==4)
								label83.setText("inside:"+t1[4]+","+i);
	              //  	yazdirmasize_array[2][i]=t;
	                    }
	                						
	                	for(int j=1;j<5;j++)
	                	{
//	                	inside_label[2][j-1].setText("inside:"+yazdirmasize_array[2][j]+","+j);
                    //                System.out.println("inside:"+yazdirmasize_array[2][j]+","+j);
	                	}
						for(int i=0;i<kapasite3;i++)
						{
							
						//	if(asansor.add(avmgiren.arr_girenkuyrugu.get(i))==true)
							arr_girenkuyrugu.remove(i);
							i--;
							kapasite3--;
						} 
	                                         
						
					}
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					for(int i=1;i<5;i++)
					{
						asansorunkati3=i;
                                                System.out.println("3.asansör - Kat:"+asansorunkati3);
	                        label14.setText("Kat:"+asansorunkati3);
					        if(i!=4)
                               
					        label15.setText("Hedef:"+(asansorunkati3+1));
						for(int c=0;c<5;c++)
						{
						//	if(asansoraktifmi[c]==true)                                              
					//	label[c].setText("floor:"+String.valueOf(asansorunkati));
						}
						for(int j=0;j<asansor3.size();j++)
						{
							if(asansor3.get(j)==i)
							{                                         
								kat.add(i);
								asansor3.remove(j); 
								t1[i]=t1[i]-1;
								if(i==1)
									label80.setText("inside:"+t1[1]+","+i);
								else if(i==2)
									label81.setText("inside:"+t1[2]+","+i);
								else if(i==3)
								label82.setText("inside:"+t1[3]+","+i);
								else if(i==4)
									label83.setText("inside:"+t1[4]+","+i);
//								yazdirmasize_array[2][i]=yazdirmasize_array[2][i]-1;
//								inside_label[2][i-1].setText("inside:"+yazdirmasize_array[2][i]+","+i);   
//System.out.println("inside:"+yazdirmasize_array[2][i]+","+i);
								 j--; 	                                       
							}
						
						}
	                        label18.setText("Ýçerideki kiþi sayisi:"+asansor3.size());
                                            System.out.println("3.asansör - Ýçerideki kiþi sayisi:"+asansor3.size());
					    if(i!=4)
					    {
					    	
						 try
						{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					    }
					}
			
					if(asansorunkati3==4)
					{
						
						yukari3=false;
						asagi3=true;
					}
					
					}
					if(asagi3==true)
					{
                                            System.out.println("3.asansör - Yön:Asagi");
	                                    label16.setText("Yön:Asagi");
					
						kapasite3=10;
						for(int i=4;i>0;i--)
						{
							asansorunkati3=i;
                                                        System.out.println("3.asansör - Kat:"+asansorunkati3);
	                            label14.setText("Kat:"+asansorunkati3);
                                                    System.out.println("3.asansör - Hedef:"+(asansorunkati3-1));
						        label15.setText("Hedef:"+(asansorunkati3-1));
						
							if(kapasite3>0)
							for(int j=0;j<arr_cikis.size();j++)
							{
								if(arr_cikis.get(j)==i)
								{
									asansor3.add(arr_cikis.get(j));
									t1[i]=t1[i]+1;
									if(i==1)
										label80.setText("inside:"+t1[1]+","+i);
									else if(i==2)
										label81.setText("inside:"+t1[2]+","+i);
									else if(i==3)
									label82.setText("inside:"+t1[3]+","+i);
									else if(i==4)
										label83.setText("inside:"+t1[4]+","+i);
//									yazdirmasize_array[2][i]+=1;
//									inside_label[2][i-1].setText("inside:"+yazdirmasize_array[2][i]+",0");
//System.out.println("inside:"+yazdirmasize_array[2][i]+",0");
									arr_cikis.remove(j);
									j--;
									
									kapasite3--;
								}
	                             label18.setText("Ýçerideki kiþi sayisi:"+asansor3.size());
                                                            System.out.println("3.asansör - Ýçerideki kiþi sayisi:"+asansor3.size());
							if(kapasite3==0)
								break;
							}
							
							try
							{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						}
						asansorunkati3=0;
	                                       label14.setText("Kat:"+asansorunkati3);
                                                    System.out.println("3.asansör - Kat:"+asansorunkati3);
						for(int i=0;i<asansor3.size();i++)
						{
							asansor3.remove(i);
						     i--;
						}
	                                        label18.setText("Ýçerideki kiþi sayisi:"+asansor3.size());
                                                    System.out.println("3.asansör - Ýçerideki kiþi sayisi:"+asansor3.size());
							kapasite3=10;
							cikisyapacakmusteri3=false;
							asagi3=false;
							yukari3=true;
					
					
				
					}
				}
                                        }
				}
	        });
	        Thread asansor3=new Thread(new Runnable(){
	        
				@Override
				public void run() {
					while(a<1)
					{
						int []t2=new int[5];
                                            System.out.print("");
                                            if(aktif4==true)
                                            {
	                                    int kapasite4=10;
				label23.setText("Kapasite:"+kapasite4);
                                            System.out.println("4.asansör - Kapasite:"+kapasite4);
					if(yukari4==true)
					{ 
	                                    label22.setText("Yön:Yukarý");
                                            System.out.println("4.asansör - Yön:Yukarý");
	                                   
						
					if(asansorunkati4==0 && cikisyapacakmusteri4==false)
					{
	                                    label20.setText("Kat:"+asansorunkati4);
					label21.setText("Hedef:"+(asansorunkati4+1));
                                            System.out.println("4.asansör - Kat:"+asansorunkati4);
                                            System.out.println("4.asansör - Hedef:"+(asansorunkati4+1));
						for(int c=0;c<5;c++)
						{
							//if(asansoraktifmi[c]==true)
						//label[c].setText("floor:"+String.valueOf(asansorunkati));
						}
						
						if(arr_girenkuyrugu.size()<kapasite4)
						{
							kapasite4=arr_girenkuyrugu.size();
							
						}
						for(int i=0;i<kapasite4;i++)
						{
							asansor4.add(arr_girenkuyrugu.get(i)); 
							//System.out.println(avmgiren.arr_girenkuyrugu.get(i)+"a");
						
						}
	                    label24.setText("Ýçerideki kiþi sayisi:"+asansor4.size());
                                            System.out.println("4.asansör - Ýçerideki kiþi sayisi:"+asansor4.size());
	                  t2[0]=0;
                                            for(int i=1;i<5;i++)
						{
							 t2[i]=0;
							for(int j=0;j<kapasite4;j++)
							{
								if(asansor4.get(j)==i)
								{
									
									t2[i]++;
								}
							}
							if(i==1)
								label90.setText("inside:"+t2[0]+","+i);
							else if(i==2)
								label91.setText("inside:"+t2[1]+","+i);
							else if(i==3)
							label92.setText("inside:"+t2[2]+","+i);
							else if(i==4)
								label93.setText("inside:"+t2[3]+","+i);
//							yazdirmasize_array[3][i]=t;
						}
						
						for(int j=1;j<5;j++)
						{
//							inside_label[3][j-1].setText("inside:"+yazdirmasize_array[3][j]+","+j);
  //                                                  System.out.println("inside:"+yazdirmasize_array[3][j]+","+j);
						}
						for(int i=0;i<kapasite4;i++)
						{
							
						//	if(asansor.add(avmgiren.arr_girenkuyrugu.get(i))==true)
							arr_girenkuyrugu.remove(i);
							i--;
							kapasite4--;
						} 
						
					}
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					for(int i=1;i<5;i++)
					{
						asansorunkati4=i;
                                                System.out.println("4.asansör - Kat:"+asansorunkati4);
	                                       label20.setText("Kat:"+asansorunkati4);
					     if(i!=4)
                                                 System.out.println("4.asansör - Hedef:"+(asansorunkati4+1));
					        label21.setText("Hedef:"+(asansorunkati4+1));
						for(int c=0;c<5;c++)
						{
	                                            
					//		if(asansoraktifmi[c]==true)                                              
					//	label[c].setText("floor:"+String.valueOf(asansorunkati));
						}
						for(int j=0;j<asansor4.size();j++)
						{
							if(asansor4.get(j)==i)
							{                                         
								kat.add(i);
								asansor4.remove(j); 
								t2[i]=t2[i]-1;
								if(i==1)
									label90.setText("inside:"+t2[1]+","+i);
								else if(i==2)
									label91.setText("inside:"+t2[2]+","+i);
								else if(i==3)
								label92.setText("inside:"+t2[3]+","+i);
								else if(i==4)
									label93.setText("inside:"+t2[4]+","+i);
//							yazdirmasize_array[3][i]=yazdirmasize_array[3][i]-1;
//								inside_label[3][i-1].setText("inside:"+yazdirmasize_array[3][i]+","+i); 
  //                                                       System.out.println("inside:"+yazdirmasize_array[3][i]+","+i);
								 j--; 	                                       
							}
						
						}
	                                       label24.setText("Ýçerideki kiþi sayisi:"+asansor4.size());
                                  System.out.println("4.asansör - Ýçerideki kiþi sayisi:"+asansor4.size());
					    if(i!=4)
					    {
					    	
						 try
						{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					    }
					}
					
					if(asansorunkati4==4)
					{
						
						yukari4=false;
						asagi4=true;
					}
					
					}
					if(asagi4==true)
					{
	                                    label22.setText("Yön:Asagi");
                                            System.out.println("4.asansör - Yön:Asagi");
						for(int c=0;c<5;c++)
						{
						//	if(asansoraktifmi[c]==true)
					//	label1[c].setText("direction:Asagi");
						}
						kapasite4=10;
						for(int i=4;i>0;i--)
						{
							asansorunkati4=i;
	                                                label20.setText("Kat:"+asansorunkati4);
                                                    System.out.println("4.asansör - Kat:"+asansorunkati4);
						        label21.setText("Hedef:"+(asansorunkati4-1));
                                                    System.out.println("4.asansör - Hedef:"+(asansorunkati4-1));
						
							if(kapasite4>0)
							for(int j=0;j<arr_cikis.size();j++)
							{
								if(arr_cikis.get(j)==i)
								{
									asansor4.add(arr_cikis.get(j));
									t2[i]=t2[i]+1;
									if(i==1)
										label90.setText("inside:"+t2[1]+","+i);
									else if(i==2)
										label91.setText("inside:"+t2[2]+","+i);
									else if(i==3)
									label92.setText("inside:"+t2[3]+","+i);
									else if(i==4)
										label93.setText("inside:"+t2[4]+","+i);
//									yazdirmasize_array[3][i]+=1;
//									inside_label[3][i-1].setText("inside:"+yazdirmasize_array[3][i]+",0");
  //                                                                      System.out.println("inside:"+yazdirmasize_array[3][i]+",0");
									arr_cikis.remove(j);
									j--;
									kapasite4--;
								}
	                                                        
							 label24.setText("Ýçerideki kiþi sayisi:"+asansor4.size());
                                                            System.out.println("4.asansör - Ýçerideki kiþi sayisi:"+asansor4.size());
	                                                 
							if(kapasite4==0)
								break;
							}
							try
							{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						}
						asansorunkati4=0;
	                                        label20.setText("Kat:"+asansorunkati4);
                                            System.out.println("4.asansör - Kat:"+asansorunkati4);
	                                        
						for(int i=0;i<asansor4.size();i++)
						{
							asansor4.remove(i);
						     i--;
						}
	                                       label24.setText("Ýçerideki kiþi sayisi:"+asansor4.size());
					//     System.out.println("Asansorun bulundugu kat:"+asansorunkati4);
                                            System.out.println("4.asansör - Asansorun bulundugu kat:"+asansorunkati4);
							kapasite4=10;
							cikisyapacakmusteri4=false;
							asagi4=false;
							yukari4=true;
					
					
					}
			
				}
                                        }
				}
	        });
	        Thread asansor4=new Thread(new Runnable(){
	     
				@Override
				public  void run() {
					while(a<1)
					{
						int []t3=new int[5];
                                            System.out.print("");
                                            if(aktif5==true)
                                            {
	                           int kapasite5=10;
	                         label29.setText("Kapasite:"+kapasite5);
                                            System.out.println("5.asansör - Kapasite:"+kapasite5);
	                                    
					if(yukari5==true)
					{
                                            System.out.println("5.asansör - Yön:Yukarý");
	                  label28.setText("Yön:Yukarý");

					if(asansorunkati5==0 && cikisyapacakmusteri5==false)
					{
	                                           System.out.println("5.asansör - Kat:"+asansorunkati5);
                                                   System.out.println("5.asansör - Hedef:"+(asansorunkati5+1));
	                                label26.setText("Kat:"+asansorunkati5);
					label27.setText("Hedef:"+(asansorunkati5+1));
						
						
						if(arr_girenkuyrugu.size()<kapasite5)
						{
							kapasite5=arr_girenkuyrugu.size();
							
						}
						for(int i=0;i<kapasite5;i++)
						{
							asansor5.add(arr_girenkuyrugu.get(i)); 
							//System.out.println(avmgiren.arr_girenkuyrugu.get(i)+"a");
						
						}
	                   label30.setText("Ýçerideki kiþi sayisi:"+asansor5.size());
                                            System.out.println("5.asansör - Ýçerideki kiþi sayisi:"+asansor5.size());
                                            t3[0]=0;
                                            for(int i=1;i<5;i++)
						{
							 t3[i]=0;
							for(int j=0;j<kapasite5;j++)
							{
								if(asansor5.get(j)==i)
								{
									
									t3[i]++;
								}
							}
							if(i==1)
								label100.setText("inside:"+t3[1]+","+i);
							else if(i==2)
								label101.setText("inside:"+t3[2]+","+i);
							else if(i==3)
							label102.setText("inside:"+t3[3]+","+i);
							else if(i==4)
								label103.setText("inside:"+t3[4]+","+i);
//							yazdirmasize_array[0][i]=t;
						}
						
						for(int j=1;j<5;j++)
						{
//							inside_label[4][j-1].setText("inside:"+yazdirmasize_array[4][j]+","+j);
  //                                                  System.out.println("inside:"+yazdirmasize_array[4][j]+","+j);
						}
						for(int i=0;i<kapasite5;i++)
						{
							
						//	if(asansor.add(avmgiren.arr_girenkuyrugu.get(i))==true)
							arr_girenkuyrugu.remove(i);
							i--;
							kapasite5--;
						} 
						
					}
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					for(int i=1;i<5;i++)
					{
						asansorunkati5=i;
	                                        label26.setText("Kat:"+asansorunkati5);
                                            System.out.println("5.asansör - Kat:"+asansorunkati5);
					        if(i!=4)
                                                    System.out.println("5.asansör - Hedef:"+(asansorunkati5+1));
					        label27.setText("Hedef:"+(asansorunkati5+1));
						for(int c=0;c<5;c++)
						{
					//  if(asansoraktifmi[c]==true)                                              
					//	label[c].setText("floor:"+String.valueOf(asansorunkati));
						}
						for(int j=0;j<asansor5.size();j++)
						{
							if(asansor5.get(j)==i)
							{                                         
								kat.add(i);
								asansor5.remove(j); 	
								t3[i]=t3[i]-1;
								if(i==1)
									label100.setText("inside:"+t3[1]+","+i);
								else if(i==2)
									label101.setText("inside:"+t3[2]+","+i);
								else if(i==3)
								label102.setText("inside:"+t3[3]+","+i);
								else if(i==4)
									label103.setText("inside:"+t3[4]+","+i);
//								yazdirmasize_array[4][i]=yazdirmasize_array[4][i]-1;
//								inside_label[4][i-1].setText("inside:"+yazdirmasize_array[4][i]+","+i);          
  //                                                             System.out.println("inside:"+yazdirmasize_array[4][i]+","+i);
								 j--; 	                                       
							}
						
						}
	                                       label30.setText("Ýçerideki kiþi sayisi:"+asansor5.size());
                                            System.out.println("5.asansör - Ýçerideki kiþi sayisi:"+asansor5.size());
					    if(i!=4)
					    {
					    	
						 try
						{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					    }
					}
					//for(int j=0;j<kat5.size();j++)
						//System.out.println(kat5.get(j));
					if(asansorunkati5==4)
					{
						
						yukari5=false;
						asagi5=true;
					}
					
					}
					if(asagi5==true)
					{
					/*	for(int c=0;c<5;c++)
						{
					//		if(asansoraktifmi[c]==true)
					//	label1[c].setText("direction:Asagi");
						}*/
	                     label28.setText("Yön:Asagi");
                                            System.out.println("5.asansör - Yön:Asagi");
						kapasite5=10;
						for(int i=4;i>0;i--)
						{
							asansorunkati5=i;
	                           label26.setText("Kat:"+asansorunkati5);
                                                    System.out.println("5.asansör - Kat:"+asansorunkati5);
						        label27.setText("Hedef:"+(asansorunkati5-1));
                                                    System.out.println("5.asansör - Hedef:"+(asansorunkati5-1));
							
							if(kapasite5>0)
							for(int j=0;j<arr_cikis.size();j++)
							{
								if(arr_cikis.get(j)==i)
								{
									asansor5.add(arr_cikis.get(j));
									t3[i]=t3[i]+1;
									if(i==1)
										label100.setText("inside:"+t3[1]+","+i);
									else if(i==2)
										label101.setText("inside:"+t3[2]+","+i);
									else if(i==3)
									label102.setText("inside:"+t3[3]+","+i);
									else if(i==4)
										label103.setText("inside:"+t3[4]+","+i);
//									yazdirmasize_array[4][i]+=1;
//									inside_label[4][i-1].setText("inside:"+yazdirmasize_array[4][i]+",0");
  //                                                                    System.out.println("inside:"+yazdirmasize_array[4][i]+",0");
									arr_cikis.remove(j);
									j--;
									kapasite5--;
								}
	                        label30.setText("Ýçerideki kiþi sayisi:"+asansor5.size());
                                                            System.out.println("5.asansör - Ýçerideki kiþi sayisi:"+asansor5.size());
							if(kapasite5==0)
								break;
							}
							
							try
							{
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						}
						asansorunkati5=0;
	                      label26.setText("Kat:"+asansorunkati5);
                                            System.out.println("5.asansör - Kat:"+asansorunkati5);
						for(int i=0;i<asansor5.size();i++)
						{
							asansor5.remove(i);
						     i--;
						}
	                                        label30.setText("Ýçerideki kiþi sayisi:"+asansor5.size());
                                            System.out.println("5.asansör - Ýçerideki kiþi sayisi:"+asansor5.size());
					//	System.out.println("Asansorun bulundugu kat:"+asansorunkati5);
							kapasite5=10;
							cikisyapacakmusteri5=false;
							asagi5=false;
							yukari5=true;
					
					
					}

				}
                                        }
				}

	        });
	        Thread kontrolthread=new Thread(new Runnable(){

				@Override
				public void run() {
                            
					int i=0,m=0,n=0,j=0,k=0;
					
					while(a<1)
					{
						if(i<1)
						{
							
					asansor0.start();
					
					label1.setText("mode:working");
                                                    System.out.println("mode:working");
					labeltut[0]=true;
					
					i++;
						}
					//	System.out.println("Hata gibi:"+(arr_cikis.size()+arr_girenkuyrugu.size()));
					if(arr_cikis.size()+arr_girenkuyrugu.size()>=20  && j==0)
					{   
		
						
						if(j==0)
						{
						asansor1.start();
						aktif2=true;
						label7.setText("mode:working");
                                                    System.out.println("mode:working");
						j++;
						}
	                 
					}
                                        if(arr_cikis.size()+arr_girenkuyrugu.size()<20 && j>=1 )
					{
						aktif2=false;
						label7.setText("mode:ýdle");
                                            System.out.println("mode:ýdle");
						j++;
					}	
					 if(arr_cikis.size()+arr_girenkuyrugu.size()>=20 && j!=0)
						{
							aktif2=true;
							label7.setText("mode:working");
                                                    System.out.println("mode:working");
						j++;
						}
						
					
					if(arr_cikis.size()+arr_girenkuyrugu.size()>=40 && m==0 )
					{   
						if(m==0)
						{
						asansor2.start();
						aktif3=true;
						label13.setText("mode:working");
                                                    System.out.println("mode:working");
						m++;
						}
						
					}
                                         if(arr_cikis.size()+arr_girenkuyrugu.size()<40 && m>=1 )
					{
						aktif3=false;
						label13.setText("mode:ýdle");
                                            System.out.println("mode:ýdle");
						m++;
					}	
                                         if(arr_cikis.size()+arr_girenkuyrugu.size()>=40 && m!=0)
						{
                                                   
						 aktif3=true;
					 label13.setText("mode:working");
                                                    System.out.println("mode:working");
						m++;
						}
                                         if(arr_cikis.size()+arr_girenkuyrugu.size()>=60 && n==0)
					{  
						if(n==0)
						{
						asansor3.start();
						aktif4=true;
						label19.setText("mode:working");
                                                    System.out.println("mode:working");
						n++;
						}
					
					}
                                         if(arr_cikis.size()+arr_girenkuyrugu.size()<60 && n>=1 )
					{
						aktif4=false;
						label19.setText("mode:ýdle");
                                            System.out.println("mode:ýdle");
						n++;
					}	
                                         if(arr_cikis.size()+arr_girenkuyrugu.size()>=60 && n!=0 )
						{
							aktif4=true;
							label19.setText("mode:working");
                                                    System.out.println("mode:working");
						n++;
						}
                                         if(arr_cikis.size()+arr_girenkuyrugu.size()>=80 && k==0 )
					{   
						if(j==0)
						{
						asansor4.start();
						aktif5=true;
						label25.setText("mode:working");
                                                    System.out.println("mode:working");
						k++;
						}
						
					}
                                         if(arr_cikis.size()+arr_girenkuyrugu.size()<80 && k>=1  )
					{
						aktif5=false;
						label25.setText("mode:ýdle");
                                            System.out.println("mode:ýdle");
						k++;
					}	
					 if(arr_cikis.size()+arr_girenkuyrugu.size()>=80 && k!=0)
						{
						 aktif5=true;
						 label25.setText("mode:working");
                                                    System.out.println("mode:working");
						k++;
						}
					 
					 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					}
				}
	        });
	        
	        Thread avmgiris=new Thread(new Runnable(){
                    
                    
	            
				@Override
				public void run(){
          
	    	
					
					kontrolthread.start();
					
					while(0<100 && a<1)
					{
						
						try {
							Thread.sleep(400);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							
							e.printStackTrace();
						}	
						
					Random random=new Random();
					giren_sayisi=random.nextInt(10)+1;
					for(int i=0;i<giren_sayisi;i++)
					{
						Random random1=new Random();
						gireningidecegikat=random1.nextInt(4)+1;
						arr_girenkuyrugu.add(gireningidecegikat);
						//label.setText("Avmye "+String.valueOf(arr_girenkuyrugu.size())+" kiþi giriþ yaptý");
					}
					//System.out.println("Yeni giris yapan sayisi:"+giren_sayisi);
				//	System.out.println(arr_girenkuyrugu.size()+" --- Kuyruktaki insan sayisi");
				    label50.setText("0.Kat: "+(arr_girenkuyrugu.size()));
                                            System.out.println("0.Kat:"+(arr_girenkuyrugu.size()));
	         
					}
					}
	        	
	        });
	        
	        
	    	
	      
	      frame.getContentPane();
	      
	      button.setBounds(150, 120, 150,150);
	      panel.setLayout(null);
	      panel.add(button);
	      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      frame.add(panel);
	      frame.setSize(500, 500);
	      frame.setVisible(true);
              

	        
	
	    button.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	 
	            	frame.setVisible(false);
	              //  label2.setLayout(null);
	              //  frame2.getContentPane();
	                         
                        panel2.setLayout(null);
                        button2.setBounds(0,0,300,300);
                        
                        label1.setBounds(10, 10, 100, 70);
                        label2.setBounds(10, 50, 100,70);
                        label3.setBounds(10, 90, 100,70);
                        label4.setBounds(10, 130, 100,70);
                        label5.setBounds(10, 170, 100,70);
                        label6.setBounds(10, 210, 150,70);
                        label7.setBounds(180, 10, 100, 70);
                        label8.setBounds(180, 50, 100, 70);
                        label9.setBounds(180, 90, 100, 70);
                        label10.setBounds(180, 130, 100, 70);
                        label11.setBounds(180, 170, 100, 70);
                        label12.setBounds(180, 210, 150, 70);
                        label13.setBounds(350, 10, 100,70);
                        label14.setBounds(350, 50, 100, 70);
                        label15.setBounds(350, 90, 100, 70);
                        label16.setBounds(350, 130, 100, 70);
                        label17.setBounds(350, 170, 100, 70);
                        label18.setBounds(350, 210, 150, 70);
                        label19.setBounds(520, 10, 100,70);
                        label20.setBounds(520, 50, 100, 70);
                        label21.setBounds(520, 90, 100, 70);
                        label22.setBounds(520, 130, 100, 70);
                        label23.setBounds(520, 170, 100, 70);
                        label24.setBounds(520, 210, 150, 70);
                        label25.setBounds(690, 10, 100,70);
                        label26.setBounds(690, 50, 100, 70);
                        label27.setBounds(690, 90, 100, 70);
                        label28.setBounds(690, 130, 100, 70);
                        label29.setBounds(690, 170, 100, 70);
                        label30.setBounds(690, 210, 150, 70);
                        label50.setBounds(10,700,150,70);
                        label51.setBounds(10,750,150,70);
                        label52.setBounds(10,800,150,70);
                        label53.setBounds(10,850,150,70);
                        label54.setBounds(10,900,150,70);
                        label60.setBounds(10,550,150,70);
                        label61.setBounds(10,600,150,70);
                        label62.setBounds(10,650,150,70);
                        label63.setBounds(10,700,150,70);
                        label60.setBounds(10,300,150,70);
                        label61.setBounds(10,350,150,70);
                        label62.setBounds(10,400,150,70);
                        label63.setBounds(10,450,150,70);
                        label70.setBounds(180,300,150,70);
                        label71.setBounds(180,350,150,70);
                        label72.setBounds(180,400,150,70);
                        label73.setBounds(180,450,150,70);
                        label80.setBounds(350,300,150,70);
                        label81.setBounds(350,350,150,70);
                        label82.setBounds(350,400,150,70);
                        label83.setBounds(350,450,150,70);
                        label90.setBounds(520,300,150,70);
                        label91.setBounds(520,350,150,70);
                        label92.setBounds(520,400,150,70);
                        label93.setBounds(520,450,150,70);
                        label100.setBounds(690,300,150,70);
                        label101.setBounds(690,350,150,70);
                        label102.setBounds(690,400,150,70);
                        label103.setBounds(690,450,150,70);
                        
                        panel2.add(label1);
                        panel2.add(label2);
                        panel2.add(label3);
                        panel2.add(label4);
                        panel2.add(label5);
                        panel2.add(label6);
                        panel2.add(label7);
                        panel2.add(label8);
                        panel2.add(label9);
                        panel2.add(label10);
                        panel2.add(label11);
                        panel2.add(label12);
                        panel2.add(label13);
                        panel2.add(label14);
                        panel2.add(label15);
                        panel2.add(label16);
                        panel2.add(label17);
                        panel2.add(label18);
                        panel2.add(label19);
                        panel2.add(label20);
                        panel2.add(label21);
                        panel2.add(label22);
                        panel2.add(label23);
                        panel2.add(label24);
                        panel2.add(label25);
                        panel2.add(label26);
                        panel2.add(label27);
                        panel2.add(label28);
                        panel2.add(label29);
                        panel2.add(label30);
                        panel2.add(label50);
                        panel2.add(label51);
                        panel2.add(label52);
                        panel2.add(label53);
                        panel2.add(label54);
                        panel2.add(label60);
                        panel2.add(label61);
                        panel2.add(label62);
                        panel2.add(label63);
                        panel2.add(label70);
                        panel2.add(label71);
                        panel2.add(label72);
                        panel2.add(label73);
                        panel2.add(label80);
                        panel2.add(label81);
                        panel2.add(label82);
                        panel2.add(label83);
                        panel2.add(label90);
                        panel2.add(label91);
                        panel2.add(label92);
                        panel2.add(label93);
                        panel2.add(label100);
                        panel2.add(label101);
                        panel2.add(label102);
                        panel2.add(label103);
                        
                        frame2.add(panel2);
                        button2.setBounds(700,700, 300, 300);
	                panel2.add(button2);
                        
	                   
	                
	                frame2.setSize(1000, 1000);
                        frame2.setLocation(500, 50);
	                frame2.setVisible(true);
                        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	                avmgiris.start();
	    	    	avmcikis.start();
	    	    	
	            	
	            	
	           //   
	              
	                
	                
	            	

	            }

				
				
	        });
            button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        a=1;
                        
                 
                    }
            
            
	

	});
                
                    }
}


