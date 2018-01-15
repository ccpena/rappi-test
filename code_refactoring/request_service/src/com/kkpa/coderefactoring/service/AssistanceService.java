package com.kkpa.coderefactoring.service;

import com.kkpa.coderefactoring.dto.ServiceDTO;

public interface AssistanceService {

	ServiceDTO find(Long idService);
	
	/**
	 * M�todo que invocar� la capa de persistencia.
	 * Verifica si el servicio est� disponible.
	 * Se considera disponible si el status del servicio es 1.
	 * @param service Servicio a verificar
	 * @return true si est� disponible.
	 */
	boolean isAvailable(ServiceDTO service);
	
	void update(ServiceDTO service); 
	
}
