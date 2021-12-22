package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountNumberArrival {

	public static void main(String[] args) {
		
		Stream<Long> accountNumberStream = Stream.of(41242854022L,765444098776L,123677765359L,567809875432L,349087659076L,123456780987L,890765780984L,456787690987L,324567896549L,214367803214L,543215678906L,456789087654L,421167888767L,655645447788L,456078999655L,322914567900L,676756545788L,977454334677L,677889898990L,435678897897L,56787689997L);
		
		List<Long> temp = accountNumberStream.filter((accou)->accou>550000000000L).sorted().collect(Collectors.toList());
		temp.forEach((p)->System.out.println(p));
	}
}
