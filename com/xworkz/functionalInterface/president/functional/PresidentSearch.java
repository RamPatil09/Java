package com.xworkz.functionalInterface.president.functional;

import com.xworkz.functionalInterface.president.dto.PresidentDTO;

@FunctionalInterface
public interface PresidentSearch {

	boolean proannouncement(PresidentDTO dto, String arg2);
}
