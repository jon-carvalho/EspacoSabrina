package com.espacosabrina.sistemadecontrole.services

import com.espacosabrina.sistemadecontrole.dtos.AestheticAttendanceDTO
import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.attendanceDTOToModel
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientDTOToModel
import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.repositories.AestheticAttendanceRepository
import com.espacosabrina.sistemadecontrole.repositories.ClientRepository
import org.springframework.stereotype.Service

@Service
class AestheticAttendanceService(private val repository: AestheticAttendanceRepository) {

    fun findAll(): MutableList<AestheticAttendanceModel> {
        return repository.findAll()
    }

    fun save(attendanceDTO: AestheticAttendanceDTO): AestheticAttendanceDTO {
        var attendanceModel = attendanceDTO.attendanceDTOToModel()

        repository.save(attendanceModel)
        return attendanceDTO
    }
}