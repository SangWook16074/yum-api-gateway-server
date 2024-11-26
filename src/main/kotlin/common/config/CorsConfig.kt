package common.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer

@Configuration
class CorsConfig : WebFluxConfigurer {
    override fun addCorsMappings(corsRegistry: CorsRegistry) {
        corsRegistry.addMapping("/**") // 모든 경로 허용
            .allowedOrigins("*")       // 모든 도메인 허용
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
    }
}