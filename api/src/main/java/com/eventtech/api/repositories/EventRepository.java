package com.eventtech.api.repositories;

import com.eventtech.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository <Event, UUID> {
}
