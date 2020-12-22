package com.TestNG.Dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderOther_Cls {
	 @DataProvider(name="SearchData")
		public  Object[][] getdataFromDataprovider(){
			return new Object[][] {
				{"vinod","India"},
				{"ravi","USA"},
				{"Rock","UK"}
			};
		

}
}