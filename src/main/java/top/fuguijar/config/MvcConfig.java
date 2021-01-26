package top.fuguijar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author fuguijar.top
 * @date 2021-01-26
 */
@ComponentScan("top.fuguijar.controller")
@Configuration
@EnableWebMvc
public class MvcConfig {
}
