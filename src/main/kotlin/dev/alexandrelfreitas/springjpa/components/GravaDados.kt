package dev.alexandrelfreitas.springjpa.components

import dev.alexandrelfreitas.springjpa.entidades.OrdemAutomatica
import dev.alexandrelfreitas.springjpa.repository.OrdemAutomaticaRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate
import java.time.ZoneId

@Component
class GravaDados {

    private val LOG by lazy { LoggerFactory.getLogger(GravaDados::class.java) }

    @Autowired
    private lateinit var ordemAutomaticaRepository: OrdemAutomaticaRepository

    @EventListener(ApplicationReadyEvent::class)
    fun gravarNaBase() {
        val ordemAutomatica = OrdemAutomatica(
                dataOrdemAutomatica =  LocalDate.now(ZoneId.of("America/Sao_Paulo"))
        )
        val ordem = grava(ordemAutomatica)
        LOG.info("ORDEM: {}", ordem)
    }

    @Transactional
    fun grava(ordemAutomatica: OrdemAutomatica) : OrdemAutomatica {
        LOG.info("Incluindo dados")

        return ordemAutomaticaRepository.saveAndFlush(ordemAutomatica)
    }

}