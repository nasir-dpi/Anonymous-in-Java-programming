
public class Startup {
	 //2nd stage
	
	//BasicInformation bInfo = new BasicInformation()
	//4th stage static krte hobe
	static BasicInformation bInfo = new BasicInformation() {
		
		@Override
		public String getBasicInfo() {
			// TODO Auto-generated method stub
			return "Hello";
		}

		@Override
		public void m1() {
			// TODO Auto-generated method stub
			
		}
	};

	public static void main(String[] args) {
		
		
		//1st stage
			/*
			 	BasicInformation bInfo = new BasicInformation() {
			
			@Override
			public String getBasicInfo() {
				// TODO Auto-generated method stub
				return "Hello";
			}
		};
			 */
		
		//3rd stage 
		
		//bInfo.get
		
		//5th stage
		System.out.println(bInfo.getBasicInfo());
		
		Myclass mobj = new Myclass();
		mobj.m1(new BasicInformation() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getBasicInfo() {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}

}
