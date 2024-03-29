package com.luis.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.luis.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {
	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pgto, Date instantePedido) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(instantePedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		
		pgto.setDataVencimento(cal.getTime());
	}
}
