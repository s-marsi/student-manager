package com.est.gl.models;

import java.util.UUID;

public record Student(
    UUID id, String firstName, String lastName, String email ) {
}
