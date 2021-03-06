package com.kkpa.cubesummation.logic;

import java.util.Map;

import com.kkpa.cubesummation.dto.OperationDTO;
import com.kkpa.cubesummation.exceptions.CubeException;

public interface CubeStrategy {
	
	public static final String TOKEN_KEY_MAP = "-";
	
	public static final String OK = "OK";

	public void process(OperationDTO operDTO, Map<String, Long> mapCube) throws CubeException;
	
}
