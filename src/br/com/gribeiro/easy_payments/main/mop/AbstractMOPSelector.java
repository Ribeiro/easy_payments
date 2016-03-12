package br.com.gribeiro.easy_payments.main.mop;

import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public abstract class AbstractMOPSelector {

	public String getMOPFrom(AbstractMT mt){
		Field field = getFirstInChainFrom(mt);
		return selectMOPFrom(field);
		
	}
	
	protected abstract Field getFirstInChainFrom(AbstractMT mt);
	protected abstract String selectMOPFrom(Field field);
	
}
