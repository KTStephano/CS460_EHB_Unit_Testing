package logic_layer;

/**
 * Based on the SRS control logic diagram
 */
public enum Event
{
    /* Entry to the initial state */
    INIT_EVENT, // NOTE may not be necessary
    BUTTON_PRESSED,
    BRAKE_FORCE_FULLY_ENGAGED,
    TIMER_TICK,

    // Variations of BUTTON_PRESSED
    BUTTON_PRESSED_SPEED_STOP, // speed === 0
    BUTTON_PRESSED_SPEED_LOW,  // speed <= 40km/h
    BUTTON_PRESSED_SPEED_MED,  // speed > 40km/h && < 80km/h
    BUTTON_PRESSED_SPEED_HIGH, // speed >= 80km/h


    /* The following events will be discontinued after refactoring the logic interfaces */
    // Button events
    BUTTON_PUSHED,
    BUTTON_HELD,

    // Brake events
    BRAKE_ENGAGED_PARK,
    BRAKE_DISENGAGED_PARK,
    BRAKE_FULLY_ENGAGED,
    BRAKE_FULLY_DISENGAGED,

    // Speed events
    SPEED_EQUAL_TO_ZERO,
    SPEED_GREATER_THAN_ZERO,

    // Transmission events
    TRANSMISSION_SHIFT_IN_PARK,
    TRANSMISSION_SHIFT_OUT_PARK,

    // Timer events
    TIMER_DISPATCH_FORCE, /* Open to suggestions on how to rephrase this. Event in the SRS diagram is confusing */
}
