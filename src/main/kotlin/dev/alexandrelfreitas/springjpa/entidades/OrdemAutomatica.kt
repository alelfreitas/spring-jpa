package dev.alexandrelfreitas.springjpa.entidades

import java.time.LocalDate
import java.time.ZoneId
import javax.persistence.*

@Entity
@Table(name = "ORD_AUTC")
//@IdClass(OrdemAutomaticaIdentity::class)
data class OrdemAutomatica(

        @Column(name = "DT_ORD_AUTC", columnDefinition = "DATETIME")
        var dataOrdemAutomatica: LocalDate,

        @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
        val numeroSequencialOrdemAutomatica: Int = 0

)