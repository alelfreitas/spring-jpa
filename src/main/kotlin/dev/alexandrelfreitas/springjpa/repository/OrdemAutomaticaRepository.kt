package dev.alexandrelfreitas.springjpa.repository

import dev.alexandrelfreitas.springjpa.entidades.OrdemAutomatica
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDate


@Repository
interface OrdemAutomaticaRepository : JpaRepository<OrdemAutomatica, Int> {
}