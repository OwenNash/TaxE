package com.taxe.game.nodes;

import com.badlogic.gdx.graphics.Texture;

/**
 * Specifies textures of all different node types.
 */
public class NodeTextures {

    public static final Texture[] CITY = {
            new Texture("Nodes/city.png"),
            new Texture("Nodes/city-highlighted.png"),
            new Texture("Nodes/city-selected.png")};

    public static final Texture[] HOMEBASE = {
            new Texture("Nodes/homebase.png"),
            new Texture("Nodes/homebase-highlighted.png"),
            new Texture("Nodes/homebase-selected.png")};

    public static final Texture[] JUNCTION = {
            new Texture("Nodes/junction.png"),
            new Texture("Nodes/junction-highlighted.png"),
            new Texture("Nodes/junction-selected.png")};

    public static final Texture[] INTERMEDIATE = {
            new Texture("Nodes/intermediate.png"),
            new Texture("Nodes/intermediate-highlighted.png"),
            new Texture("Nodes/intermediate-selected.png")};
}