package com.mars.explore.misson.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.explore.misson.mock.ProbeMock;
import com.mars.explore.misson.model.Probe;

@RestController
@RequestMapping("/probes")
public class ProbeResource {
	
	private static List<Probe> probes = ProbeMock.getMockProbes();
	
	@GetMapping
	public List<Probe> listAllProbes() {
		return probes;
	}

}
