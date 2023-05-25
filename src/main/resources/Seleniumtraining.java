
public class Seleniumtraining {
	public static void main(String[] args) {
		
		//declaration
		
		@findBy(xpath="//h1@class='page-header']")
		private webElement pageheader;
		
		@findBY(xpat = "add")
		private wedElement pageheader;
		
		@findBY(id = "quantity")
		private wedElement plusButton;
		
		@findBy(xpath="//button[.='Addto cart']")
		private wedElement addToCartButton;
		
		@findBy(xpath="//span[@class='message']")
		private wedElement message;
		//initialization
		public seleniumTraining(WebDriver deiver) {
			pageFactory.initElement(driver, this);
			
		}
		//utilization
		
		public string get pageHeadre() {
			return pagaHeader.getText();
		}
		public void doubleClickplusButton(webDriverutility web) {
			
			web.doublecluckOnElement(plusButton);
		}
		public sting get(){
			return quantity.getAttribute("value");
		}
			}
	
		}
		
		
		
	
		
		 

	}

}
