package org.yasindu.sptask.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	public ModelMapper mapper(){
		return new ModelMapper();
	}
}
