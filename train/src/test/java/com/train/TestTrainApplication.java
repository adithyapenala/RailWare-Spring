package com.train;

import org.springframework.boot.SpringApplication;

public class TestTrainApplication {

	public static void main(String[] args) {
		SpringApplication.from(TrainApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
