package com.w3cjava.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trace2Controller {

    private final Logger logger = LoggerFactory.getLogger(Trace2Controller.class);

    /**
     * 
     * @author cos
     * @desc 1.0.0
     * @param request
     * @return
     * 	X-B3-TraceId：一条请求链路（Trace）的唯一标识，必须值
		X-B3-SpanId：一个工作单元（Span）的唯一标识，必须值
		X-B3-ParentSpanId:：标识当前工作单元所属的上一个工作单元，Root Span（请求链路的第一个工作单元）的该值为空
		X-B3-Sampled：是否被抽样输出的标志，1表示需要被输出，0表示不需要被输出
		X-Span-Name：工作单元的名称
     */
    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace(HttpServletRequest request) {
    	logger.info("===<call trace-2>===");
    	logger.info("===<call trace-2, TraceId={}, SpanId={}>===",
    			request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
    	return "Trace";
    }
}
