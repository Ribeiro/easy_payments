package br.com.gribeiro.easy_payments.test.mop;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class MOPSelectorTest {
	private static final String BASE_FOLDER = "test"+ File.separator + MOPSelectorTest.class.getSimpleName() + File.separator;
	
	@Test
	public void shouldSelectDebitMOPAsBook() throws IOException  {
		MT103 mt103 = MT103.parse(new File(BASE_FOLDER + "mt103.txt"));
		assertThat(mt103.getSender(), is("ESPBESMMAXXX"));
		assertThat(mt103.getReceiver(), is("BICFOOYYAXXX"));
//		System.out.println(mt103.getField54A());
//		System.out.println(mt103.getField54B());
//		System.out.println(mt103.getField54D());
//		
//		System.out.println(mt103.getField53A());
//		System.out.println(mt103.getField53B());
//		System.out.println(mt103.getField53D());
		
		

	}

}
