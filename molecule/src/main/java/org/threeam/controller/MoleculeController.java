package org.threeam.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.threeam.constants.MoleculeConstants;
import org.threeam.dto.MoleculeDto;
import org.threeam.dto.ResponseDto;
import org.threeam.service.IMoleculeService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class MoleculeController {

    private IMoleculeService iMoleculeService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createMolecule(@Valid @RequestBody MoleculeDto moleculeDto) {
        iMoleculeService.createMolecule(moleculeDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(MoleculeConstants.STATUS_201, MoleculeConstants.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<MoleculeDto>> fetchAllMolecules(@RequestParam String accountId) {
        List<MoleculeDto> moleculeDtoList = iMoleculeService.fetchAllMolecules(accountId);
        return ResponseEntity.status(HttpStatus.OK).body(moleculeDtoList);
    }

    @GetMapping("/fetch_detail")
    public ResponseEntity<MoleculeDto> fetchMoleculeDetail(@RequestParam Long moleculeId) {
        MoleculeDto moleculeDto = iMoleculeService.fetchMoleculeDetail(moleculeId);
        return ResponseEntity.status(HttpStatus.OK).body(moleculeDto);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateLoanDetails(@Valid @RequestBody MoleculeDto moleculeDto) {
        boolean isUpdated = iMoleculeService.updateMolecule(moleculeDto);
        if(isUpdated) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDto(MoleculeConstants.STATUS_200, MoleculeConstants.MESSAGE_200));
        }else{
            return ResponseEntity
                    .status(HttpStatus.EXPECTATION_FAILED)
                    .body(new ResponseDto(MoleculeConstants.STATUS_417, MoleculeConstants.MESSAGE_417_UPDATE));
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteLoanDetails(@RequestParam Long moleculeId) {
        boolean isDeleted = iMoleculeService.deleteMolecule(moleculeId);
        if(isDeleted) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDto(MoleculeConstants.STATUS_200, MoleculeConstants.MESSAGE_200));
        }else{
            return ResponseEntity
                    .status(HttpStatus.EXPECTATION_FAILED)
                    .body(new ResponseDto(MoleculeConstants.STATUS_417, MoleculeConstants.MESSAGE_417_DELETE));
        }
    }
}
