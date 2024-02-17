package com.phasmophobia.controllers;

import com.phasmophobia.constant.GhostEvidence;
import com.phasmophobia.constant.GhostName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ghost")
@Api(tags = "GhostController", description = "Endpoints for managing ghosts")
public class GhostController {

    /*  @Autowired
    private GhostService ghostService;
    */
    @GetMapping("/names")
    @ApiOperation("Get all names ghost")
    public GhostName[] getAllGhostTypes() {
        return GhostName.values();
    }


    @GetMapping("/evidences")
    @ApiOperation("Get all evidences")
    public GhostEvidence[] getAllGhostEvidences() {
        return GhostEvidence.values();
    }


}
