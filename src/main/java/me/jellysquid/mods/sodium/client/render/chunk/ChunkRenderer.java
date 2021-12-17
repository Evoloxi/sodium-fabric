package me.jellysquid.mods.sodium.client.render.chunk;

import me.jellysquid.mods.sodium.client.gl.device.CommandList;
import me.jellysquid.mods.sodium.client.render.chunk.passes.BlockRenderLayer;

/**
 * The chunk render backend takes care of managing the graphics resource state of chunk render containers. This includes
 * the handling of uploading their data to the graphics card and rendering responsibilities.
 */
public interface ChunkRenderer {
    /**
     * Renders the given chunk render list to the active framebuffer.
     * @param matrices The camera matrices to use for rendering
     * @param commandList The command list which OpenGL commands should be serialized to
     * @param renders An iterator over the list of chunks to be rendered
     * @param renderLayer The block render renderLayer to execute
     * @param camera The camera context containing chunk offsets for the current render
     */
    void render(ChunkRenderMatrices matrices, CommandList commandList, ChunkRenderList renders, BlockRenderLayer renderLayer, ChunkCameraContext camera);

    /**
     * Deletes this render backend and any resources attached to it.
     */
    void delete();}
