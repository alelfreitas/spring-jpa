package dev.alexandrelfreitas.springjpa.entidades

import java.io.Serializable
import java.time.LocalDate
import javax.persistence.Embeddable

@Embeddable
data class OrdemAutomaticaIdentity(
        var dataOrdemAutomatica: LocalDate
        //var numeroSequencialOrdemAutomatica: Int
) : Serializable

