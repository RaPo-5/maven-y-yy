package pl.beone.promena.configuration

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan(basePackages = ["mvnn.configuration"])
@PropertySource("classpath:module-yy.properties")
class YyModuleConfig