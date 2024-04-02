CREATE UNIQUE INDEX events_slug_key ON events(slug);
CREATE UNIQUE INDEX attendees_event_id_email_key ON attendees(event_id, email);
CREATE UNIQUE INDEX check_ins_attendee_id_key on check_ins(attendee_id);