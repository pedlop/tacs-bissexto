package com.br.ufg.inf.bissexto;

import org.junit.Assert;
import org.junit.Test;

public class AnoBissextoTeste {
    
	@Test
	public void main(){
		
		AnoBissexto ano = new AnoBissexto();
		
		Assert.assertEquals(true, ano.anoBissexto(4000));
		Assert.assertEquals(true, ano.anoBissexto(320));
		Assert.assertEquals(false, ano.anoBissexto(2019));
	}
}
