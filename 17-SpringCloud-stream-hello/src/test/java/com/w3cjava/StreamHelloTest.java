package com.w3cjava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableBinding(value = { StreamHelloTest.SinkSender.class })
public class StreamHelloTest {
	@Autowired
	private SinkSender sinkSender;

	@Test
	public void sinkSenderTester() {
		sinkSender.output().send(MessageBuilder.withPayload("produce a message ：http://www.w3cjava.com").build());
	}

	public interface SinkSender {

		String OUTPUT = "input";

		@Output(SinkSender.OUTPUT)
		MessageChannel output();

	}
}
